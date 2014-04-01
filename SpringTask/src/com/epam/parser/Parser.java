package com.epam.parser;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */
public interface Parser {

    public void loadBeanDefinitions(String xmlPath);// - считывает с файловой системы конфигурационный xml-файл
    public void setValidating(boolean validating);// - устанавливает выполнять или нет XML validation в соотв. с XML Schema (по желанию)
    public void setParserType(ParserTypes parserType);// - задает тип парсера для анализа конфигурационного xml-файла. parserType может принимать значения: ParserTypes.DOM, ParserTypes.SAX, ParserTypes.StAX (реализовать поддержку одного из парсеров DOM, SAX, StAX)

}
