package util;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class XmlFileProcess {

    public List<Integer> getParamNumbers (String param) {
        List<Integer> numbers = new ArrayList<>();
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(new StringReader(param));

            Document document = documentBuilder.parse(inputSource);
            NodeList nodeList = document.getElementsByTagName("numbers");
            for (int i = 0; i < nodeList.getLength() ; i++) {
                Element element = (Element) nodeList.item(i);
                NodeList numberOne = element.getElementsByTagName("paramOne");
                Element element1 = (Element) numberOne.item(0);
                numbers.add(getCharacterDataFromElement(element1));
                NodeList numberTwo = element.getElementsByTagName("paramTwo");
                Element element2 = (Element) numberTwo.item(0);
                numbers.add(getCharacterDataFromElement(element2));
                NodeList numberThree = element.getElementsByTagName("paramThree");
                Element element3 = (Element) numberThree.item(0);
                numbers.add(getCharacterDataFromElement(element3));
            }
            return numbers;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    private Integer getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            int i = Integer.parseInt(cd.getData());
            return i;
        }
        return null;
    }


}
