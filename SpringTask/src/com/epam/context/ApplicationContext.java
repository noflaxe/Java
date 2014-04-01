package com.epam.context;

import com.epam.parser.ParserTypes;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */
public interface ApplicationContext {

    public void setValidating(boolean validating);
    public void setParserType(ParserTypes parserType);
    public void load(String XMLFileLocation);
    public BeanFactory getBeanFactory(); //- создает и возвращает экземпляр BeanFactory, в котором хранится ссылка на объектное представление конфигурационного xml-файла
}
