import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;


import gsu.lab.java.Currency;

public class StaxParser {
	
public static void main(String[] args) {
		
		List<Currency> currencies = new ArrayList<Currency>();
		Currency currency = null;
		XMLInputFactory eventFactory = XMLInputFactory.newInstance();

		try {
			//https://naviny.by/rss/alls.xml
			URL url = new URL("http://www.nbrb.by/Services/XmlExRates.aspx");
			
			InputStream stream = url.openStream();
			XMLEventReader xmlEventReader = eventFactory.createXMLEventReader(stream);
			while(xmlEventReader.hasNext()) {
				XMLEvent xmlEvent = xmlEventReader.nextEvent();

				if(xmlEvent.isStartElement()) {

				StartElement startElement = xmlEvent.asStartElement();

				if(startElement.getName().getLocalPart().equals("Currency")) {
					currency = new Currency();
					Attribute idAttr = startElement.getAttributeByName(new QName("Id"));
                    if(idAttr != null){
                    	currency.setId(idAttr.getValue());
                    }
				}

				else if (startElement.getName().getLocalPart().equals("CharCode")) {
						xmlEvent = xmlEventReader.nextEvent();
						String charCode = xmlEvent.asCharacters().getData();
						currency.setCharCode(charCode);
				}

				else if(startElement.getName().getLocalPart().equals("Name")) {

					xmlEvent= xmlEventReader.nextEvent();

					String name = xmlEvent.asCharacters().getData();

					currency.setName(name);

				}

				else if (startElement.getName().getLocalPart().equals("Rate")) {

					xmlEvent = xmlEventReader.nextEvent();

					String rate = xmlEvent.asCharacters().getData();

					currency.setRate(Double.parseDouble(rate));

					}

				}

				if(xmlEvent.isEndElement()) {
					
					EndElement endElement = xmlEvent.asEndElement();

					if(endElement.getName().getLocalPart().equals("Currency")) {

						currencies.add(currency);

					}
				}

			}
		} catch (XMLStreamException|IOException e) {
			System.out.println(e);
		}
		
		for(Currency curr: currencies) {
			System.out.println(curr);
		}
	}
}
