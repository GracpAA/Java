package by.gsu.asoilab;

public class Commodity {
	
	private String name;
	private int price;
	
	public Commodity() {
		// TODO Auto-generated constructor stub
	}
	
	public Commodity(String name, int price){
		this.setName(name);
		this.setPrice(price);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name+"; "+FormatDecimal.convertToForamt(price, 100)+"; ";
	}
	

}
