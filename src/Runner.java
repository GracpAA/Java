import java.io.IOException;
import java.util.List;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import gsu.lab.java.Currency;
import gsu.lab.java.Parser;


public class Runner {

	public static void main(String[] args) {
		try {
			
			XMLReader reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(Parser.shared);
			reader.parse("http://www.nbrb.by/Services/XmlExRates.aspx");

			List<Currency> currencies = Parser.shared.getCurrencies();
			
			for (Currency currency : currencies) {
				System.out.println(currency);
			}
			
		} catch (SAXException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}

	}

}