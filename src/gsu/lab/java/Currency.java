package gsu.lab.java;

public class Currency {
	
	private String id;
	private String charCode;
	private String name;
	private double rate;

	public Currency() {
		super();
	}

	public Currency(String id, String charCode, String name, double rate) {
		this.id = id;
		this.charCode = charCode;
		this.name = name;
		this.rate = rate;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCharCode() {
		return charCode;
	}
	
	public void setCharCode(String charCode) {
		this.charCode = charCode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "Currency id = " + id + ", charCode = " + charCode + ", name = " + name + ", rate = " + rate + " ;";
	}
	
}
