/*******************************************************************************
 * Copyright 2010
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
package de.tudarmstadt.ukp.dkpro.core.bananasplit;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createPrimitive;
import static org.apache.uima.fit.factory.TypeSystemDescriptionFactory.createTypeSystemDescription;
import static org.apache.uima.fit.util.JCasUtil.select;
import static org.junit.Assert.assertTrue;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.fit.factory.JCasBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

public class BananaSplitterTest
{
	private static AnalysisEngine ae;

	@BeforeClass
	public static void setup() throws Exception
	{
		ae = createPrimitive(BananaSplitter.class, createTypeSystemDescription(),
				BananaSplitter.PARAM_DELETE_COVER, false,
				BananaSplitter.PARAM_MODEL_LOCATION, "classpath:/dict.xml");
	}

	@Test
	public void test()
		throws Exception
	{
		test("vormachen", null, null);
		test("vormacht", null, null);
		test("vorgemacht", null, null);
		test("vorgemachten", null, null);
		test("einlaufen", null, null);
		test("eingelaufen", null, null);
		test("Dickmilchbäurin", null, null);
		test("Kapitänsmütze", "Kapitäns", "mütze");
		test("Oberbayer", "Ober", "bayer");
		test("Miesmacher", "Mies", "macher");
		test("vollsaufen", "voll", "saufen");
		test("vollgesoffen", "voll", "gesoffen");
		test("Werkstattdienst", "Werkstatt", "dienst");
		test("aWolf", "Wolf", null);
		test("wolfA", null, null);
		test("atypisch", "typisch", null);
		test("umfallen", null, null);
	}

	private void test(String aWord, String aPart1, String aPart2) throws Exception
	{
		System.out.print("Splitting ["+aWord+"] -> ");

		JCasBuilder cb = new JCasBuilder(ae.newJCas());
		cb.add(aWord, Token.class);
		cb.close();
		ae.process(cb.getJCas());

		int i = 0;
		for (Token splitToken : select(cb.getJCas(), Token.class)) {
			System.out.print("["+splitToken.getCoveredText()+"] ");
			assertTrue(i != 0 || splitToken.getCoveredText().equals(aWord));
			assertTrue(i != 1 || splitToken.getCoveredText().equals(aPart1));
			assertTrue(i != 2 || splitToken.getCoveredText().equals(aPart2));
			i++;
		}
		System.out.println();
	}
}
