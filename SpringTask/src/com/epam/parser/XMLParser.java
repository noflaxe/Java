package com.epam.parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */
public interface XMLParser {

    void parseXml(String xmlFilePath) throws ParserConfigurationException, IOException, SAXException, ClassNotFoundException;
}
