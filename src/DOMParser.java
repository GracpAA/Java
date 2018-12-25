
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import gsu.lab.java.Currency;

public class DOMParser {
	
public static void main(String[] args) {
		
		List<Currency> currencies = new ArrayList<Currency>();
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("http://www.nbrb.by/Services/XmlExRates.aspx");
			
			doc.getDocumentElement().normalize();
			
			NodeList list = doc.getElementsByTagName("Currency");
			
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				
				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element element = (Element) node;
					
					String id = element.getAttribute("Id");
					String name = element.getElementsByTagName("Name").item(0).getTextContent();
					String charCode = element.getElementsByTagName("CharCode").item(0).getTextContent();
					double rate = Double.parseDouble(element.getElementsByTagName("Rate").item(0).getTextContent());
					
					Currency currency = new Currency(id, charCode, name, rate);
					currencies.add(currency);
				}
			}
			
			for (Currency currency : currencies) {
				System.out.println(currency);
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println(e);
		}
		
	}
}
