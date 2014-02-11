package de.tudarmstadt.ukp.dkpro.core.textnormalizer;

import java.util.Map;

import org.apache.uima.resource.ResourceInitializationException;

public interface ReplacementNormalizer
{

    Map<String, String> getReplacementMap() throws ResourceInitializationException;

}