package by.gsu.asoilab;

public class Purchase extends Commodity {
	
	private int numberOfUnits;
	
	public Purchase() {
		
	}
	
	public Purchase(String name, int price, int numberOfUnits) {
		super(name,price);
		this.numberOfUnits = numberOfUnits;
	}
	
	public int getNumberOfUnits() {
		return numberOfUnits;
	}
	
	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}
	
	
	public String getCost() {
		
		return FormatDecimal.convertToForamt(getPrice()*numberOfUnits, 100, 2);
		
	}
	
	@Override
	public String toString() {
		return getName()+"; "+FormatDecimal.convertToForamt(getPrice(), 100, 2)+"; "+numberOfUnits;
	}
	
	
	

}
