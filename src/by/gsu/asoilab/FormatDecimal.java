package by.gsu.asoilab;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FormatDecimal {
	
	private FormatDecimal() {
		
	}
	
	public static String convertToForamt(int value, int devide){
		
		BigDecimal decimalArray = new BigDecimal(value).divide(new BigDecimal(devide)).setScale(2, RoundingMode.DOWN);
		return decimalArray.toString();
		
	}

}