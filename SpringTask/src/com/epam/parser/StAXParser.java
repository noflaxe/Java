package com.epam.parser;

import com.epam.context.BeanDefinition;


import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */
public class StAXParser implements XMLParser {
    @Override
    public void parseXml(String xmlFilePath) {
        throw new UnsupportedOperationException("Not supported yet");
  /*      try {
            List<BeanDefinition> beanList = null;
            BeanDefinition current = null;
            String tagContent = null;
            XMLInputFactory factory = XMLInputFactory.newInstance();

            XMLStreamReader reader =
                    factory.createXMLStreamReader(
                            ClassLoader.getSystemResourceAsStream("resources/test.xml"));

            while (reader.hasNext()) {
                int event = reader.next();
                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        if ("bean".equals(reader.getLocalName())) {
                            current = new BeanDefinition();
                            current.setId(reader.getAttributeValue(0));
                            // current.setClazz(reader.getAttributeValue(1));
                        }
                        if ("beans".equals(reader.getLocalName())) {
                            beanList = new LinkedList<>();
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        tagContent = reader.getText().trim();
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        switch (reader.getLocalName()) {
                            case "bean":
                                beanList.add(current);
                                break;
                            case "firstName":

                                break;
                            case "lastName":
                                currEmp.lastName = tagContent;
                                break;
                            case "location":
                                currEmp.location = tagContent;
                                break;
                        }
                        break;
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
     */
    }
}
