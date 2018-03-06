package by.gsu.asoilab;

public class Commodity {
	
	private String name;
	private int price;
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
    public Commodity() {
		
	}
	
	
	public Commodity(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name+"; "+price+";";
	}
	
	


}
