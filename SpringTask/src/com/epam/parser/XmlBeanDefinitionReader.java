package com.epam.parser;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */
public class XmlBeanDefinitionReader implements Parser {

    private ParserTypes parser;
    private XMLParserFactory parserFactory;

    public XmlBeanDefinitionReader() {
        parser = ParserTypes.STAX;
    }

    public XmlBeanDefinitionReader(ParserTypes parser) {
        this.parser = parser;
    }

    @Override
    public void loadBeanDefinitions(String xmlPath) {
        parserFactory.getParser(parser).parseXml(xmlPath);
    }

    @Override
    public void setValidating(boolean validating) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void setParserType(ParserTypes parserType) {
        this.parser = parserType;
    }
}
