package com.epam.parser;

import static com.epam.parser.ParserTypes.*;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */
public class XMLParserFactory implements IXMLPaserFactory {


    @Override
    public XMLParser getParser(ParserTypes parserType) {
        if (parserType == null) {
            throw new IllegalArgumentException("parameter is null");
        }
        switch (parserType) {
            case DOM:
                return createDomParser();
            case SAX:
                return createSaxParser();
            case STAX:
                return createStaxParser();
            default:
                throw new IllegalArgumentException("Invalid parserType");
        }
    }

    private XMLParser createStaxParser() {
        return new SAXParser();

    }

    private XMLParser createSaxParser() {
        return new StAXParser();
    }

    private XMLParser createDomParser() {
        return new StAXParser();
    }


}
