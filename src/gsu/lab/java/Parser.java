package gsu.lab.java;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Parser extends DefaultHandler {
	
	public static final Parser shared = new Parser();
	
	private Currency newCurrency = null;
	private boolean isCurrency = false;
	private String tmpString = null;
	
	private List<Currency> currencies = new ArrayList<>();
	
	private Parser() {
		
	}

	public List<Currency> getCurrencies() {
		
		return currencies;
		
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		tmpString = localName;
		
		if (tmpString.equals("Currency")) {
			isCurrency = true;
			newCurrency = new Currency();
			String id = attributes.getValue(0);
			newCurrency.setId(id);
		}
		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		if (isCurrency) {
			isCurrency = false;
			currencies.add(newCurrency);
		}
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		String parameter = new String(ch, start, length).trim();
		
		if (tmpString.equals("Name") && !parameter.isEmpty()) {
			newCurrency.setName(parameter);
		}
		
		if (tmpString.equals("CharCode") && !parameter.isEmpty()) {
			newCurrency.setCharCode(parameter);
		}
		
		if (tmpString.equals("Rate") && !parameter.isEmpty()) {
			double rate =  Double.parseDouble(parameter);
			newCurrency.setRate(rate);
		}
	}
		
}
