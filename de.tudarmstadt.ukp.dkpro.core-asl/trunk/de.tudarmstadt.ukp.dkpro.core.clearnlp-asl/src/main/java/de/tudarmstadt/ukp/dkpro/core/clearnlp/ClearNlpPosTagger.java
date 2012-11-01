/*******************************************************************************
 * Copyright 2012
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.tudarmstadt.ukp.dkpro.core.clearnlp;

import static java.util.Arrays.asList;
import static org.apache.commons.io.IOUtils.closeQuietly;
import static org.apache.uima.util.Level.INFO;
import static org.uimafit.util.JCasUtil.select;
import static org.uimafit.util.JCasUtil.selectCovered;
import static org.uimafit.util.JCasUtil.toText;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.springframework.beans.DirectFieldAccessor;
import org.springframework.beans.PropertyAccessor;
import org.uimafit.component.JCasAnnotator_ImplBase;
import org.uimafit.descriptor.ConfigurationParameter;

import com.googlecode.clearnlp.classification.model.StringModel;
import com.googlecode.clearnlp.engine.EngineGetter;
import com.googlecode.clearnlp.engine.EngineProcess;
import com.googlecode.clearnlp.pos.POSNode;
import com.googlecode.clearnlp.pos.POSTagger;
import com.googlecode.clearnlp.util.pair.Pair;

import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS;
import de.tudarmstadt.ukp.dkpro.core.api.parameter.ComponentParameters;
import de.tudarmstadt.ukp.dkpro.core.api.resources.CasConfigurableProviderBase;
import de.tudarmstadt.ukp.dkpro.core.api.resources.MappingProvider;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

/**
 * Part-of-Speech annotator using Clear NLP. Requires {@link Sentence}s to be annotated before.
 * 
 * @author Richard Eckart de Castilho
 */
public class ClearNlpPosTagger
	extends JCasAnnotator_ImplBase
{
	public static final String PARAM_LANGUAGE = ComponentParameters.PARAM_LANGUAGE;
	@ConfigurationParameter(name = PARAM_LANGUAGE, mandatory = false)
	protected String language;

	public static final String PARAM_VARIANT = ComponentParameters.PARAM_VARIANT;
	@ConfigurationParameter(name = PARAM_VARIANT, mandatory = false)
	protected String variant;

	public static final String PARAM_MODEL_LOCATION = ComponentParameters.PARAM_MODEL_LOCATION;
	@ConfigurationParameter(name = PARAM_MODEL_LOCATION, mandatory = false)
	protected String modelLocation;

	public static final String PARAM_TAGGER_MAPPING_LOCATION = ComponentParameters.PARAM_TAGGER_MAPPING_LOCATION;
	@ConfigurationParameter(name = PARAM_TAGGER_MAPPING_LOCATION, mandatory = false)
	protected String mappingLocation;

	public static final String PARAM_INTERN_TAGS = ComponentParameters.PARAM_INTERN_TAGS;
	@ConfigurationParameter(name = PARAM_INTERN_TAGS, mandatory = false, defaultValue = "true")
	private boolean internTags;

	public static final String PARAM_PRINT_TAGSET = ComponentParameters.PARAM_PRINT_TAGSET;
	@ConfigurationParameter(name = PARAM_PRINT_TAGSET, mandatory = true, defaultValue="false")
	protected boolean printTagSet;

	private CasConfigurableProviderBase<Pair<POSTagger[],Double>> modelProvider;
	private MappingProvider mappingProvider;
	
	@Override
	public void initialize(UimaContext aContext)
		throws ResourceInitializationException
	{
		super.initialize(aContext);

		modelProvider = new CasConfigurableProviderBase<Pair<POSTagger[],Double>>() {
			{
				setDefault(VERSION, "20121017.0");
				setDefault(GROUP_ID, "de.tudarmstadt.ukp.dkpro.core");
				setDefault(ARTIFACT_ID,
						"de.tudarmstadt.ukp.dkpro.core.clearnlp-model-tagger-${language}-${variant}");
				
				setDefault(LOCATION, "classpath:/de/tudarmstadt/ukp/dkpro/core/clearnlp/lib/" +
						"tagger-${language}-${variant}.bin");
				setDefault(VARIANT, "ontonotes");
				
				setOverride(LOCATION, modelLocation);
				setOverride(LANGUAGE, language);
				setOverride(VARIANT, variant);
			}
			
			@Override
			protected Pair<POSTagger[],Double> produceResource(URL aUrl) throws IOException
			{
				InputStream is = null;
				try {
					is = aUrl.openStream();
					Pair<POSTagger[],Double> taggers = EngineGetter.getPOSTaggers(is);
					
					if (printTagSet) {
						Set<String> tagSet = new HashSet<String>();
						
						for (POSTagger tagger : taggers.o1) {
							PropertyAccessor accessor = new DirectFieldAccessor(tagger);
							StringModel model = (StringModel) accessor.getPropertyValue("s_model");
							tagSet.addAll(asList(model.getLabels()));
						}
						
						List<String> tagList = new ArrayList<String>(tagSet);
						Collections.sort(tagList);
						
						StringBuilder sb = new StringBuilder();
						sb.append("Model contains [").append(tagList.size()).append("] tags: ");
						
						for (String tag : tagList) {
							sb.append(tag);
							sb.append(" ");
						}
						getContext().getLogger().log(INFO, sb.toString());
					}
					
					return taggers;
				}
				catch (Exception e) {
					throw new IOException(e);
				}
				finally {
					closeQuietly(is);
				}
			}
		};
		
		mappingProvider = new MappingProvider();
		mappingProvider.setDefault(MappingProvider.LOCATION, "classpath:/de/tudarmstadt/ukp/dkpro/" +
				"core/api/lexmorph/tagset/${language}-${tagger.tagset}-tagger.map");
		mappingProvider.setDefault(MappingProvider.BASE_TYPE, POS.class.getName());
		mappingProvider.setDefault("tagger.tagset", "default");
		mappingProvider.setOverride(MappingProvider.LOCATION, mappingLocation);
		mappingProvider.setOverride(MappingProvider.LANGUAGE, language);
		mappingProvider.addImport("tagger.tagset", modelProvider);
	}

	@Override
	public void process(JCas aJCas)
		throws AnalysisEngineProcessException
	{
		CAS cas = aJCas.getCas();

		modelProvider.configure(cas);
		mappingProvider.configure(cas);
				
		for (Sentence sentence : select(aJCas, Sentence.class)) {
			List<Token> tokens = selectCovered(aJCas, Token.class, sentence);
			List<String> tokenTexts = asList(toText(tokens).toArray(new String[tokens.size()]));

			Pair<POSTagger[],Double> taggers = modelProvider.getResource();
			POSNode[] posNodes = EngineProcess.getPOSNodes(taggers, tokenTexts);

			int i = 0;
			for (Token t : tokens) {
				Type posTag = mappingProvider.getTagType(posNodes[i].pos);
				POS posAnno = (POS) cas.createAnnotation(posTag, t.getBegin(), t.getEnd());
				posAnno.setPosValue(internTags ? posNodes[i].pos.intern() : posNodes[i].pos);
				posAnno.addToIndexes();
				t.setPos((POS) posAnno);
				i++;
			}
		}
	}
}
