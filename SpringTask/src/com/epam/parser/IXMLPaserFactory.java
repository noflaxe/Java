package com.epam.parser;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */
public interface IXMLPaserFactory {

    XMLParser getParser(ParserTypes parserType);

}
