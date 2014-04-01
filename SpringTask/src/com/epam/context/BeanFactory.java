package com.epam.context;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */

    public interface BeanFactory{
        public Object getBean(String string); //- создает экземпляр класса типа Object прописанного в конфигурационном xml-файле по его id
        public <T extends Object> T getBean(String string, Class<T> type); //- создает экземпляр класса типа T прописанного в конфигурационном xml-файле по его id
    }

