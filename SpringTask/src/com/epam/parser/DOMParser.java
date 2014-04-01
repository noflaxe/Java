package com.epam.parser;

import com.epam.context.BeanDefinition;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nazar_Sheremeta on 2/14/14.
 */
public class DOMParser implements XMLParser {
    @Override
    public void parseXml(String xmlFilePath) throws ParserConfigurationException, IOException, SAXException, ClassNotFoundException {

        //Get the DOM Builder Factory
        DocumentBuilderFactory factory =
                DocumentBuilderFactory.newInstance();

        //Get the DOM Builder
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Load and Parse the XML document
        //document contains the complete XML as a Tree.
        Document document =
                builder.parse(
                        ClassLoader.getSystemResourceAsStream("xml/employee.xml"));

        List<BeanDefinition> beanList = new LinkedList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node instanceof Element) {

                BeanDefinition currentBean = new BeanDefinition();
            String currentId = node.getAttributes().getNamedItem("id").getNodeValue();
            currentBean.setId(currentId);
            String forClass = node.getAttributes().getNamedItem("class").getNodeValue();
            Class clazz = Class.forName(forClass);
            currentBean.setClazz(clazz);
                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);
                    if (cNode instanceof Element) {
                        String constructorArg = null;
                    }
                }
        }
        }

        throw new UnsupportedOperationException("Not supported yet");
    }
}
