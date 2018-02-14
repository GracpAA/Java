package by.gsu.asoilab;

public class Employee {
	
	private static final int DAILY_ALLOWANCE = 600;
	private int countOfDays;
	private String name;
	private int transporationExpenses;
	
	public Employee() {
		
	}
	
	public Employee(String name, int countOfDays, int transporationExpenses) {
		this.setName(name);
		this.setCountOfDays(countOfDays);
		this.setTransporationExpenses(transporationExpenses);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountOfDays() {
		return countOfDays;
	}

	public void setCountOfDays(int countOfDays) {
		this.countOfDays = countOfDays;
	}

	public int getTransporationExpenses() {
		return transporationExpenses;
	}

	public void setTransporationExpenses(int transporationExpenses) {
		this.transporationExpenses = transporationExpenses;
	}
	
	private int getTotal() {
		return transporationExpenses + DAILY_ALLOWANCE*countOfDays;
	}
	
	public void show() {
		System.out.print("rate = "+FormatDecimal.convertToForamt(DAILY_ALLOWANCE,100) + "\n" + "account = "+ name + "\n" + "transport = "+ FormatDecimal.convertToForamt(transporationExpenses,100) + "\n" + "total = "+FormatDecimal.convertToForamt(getTotal(), 100)+"\n\n");
	}
	
	@Override
	public String toString(){
		return FormatDecimal.convertToForamt(DAILY_ALLOWANCE,100)+"; "+name+"; "+ FormatDecimal.convertToForamt(transporationExpenses,100)+"; "+countOfDays+"; "+FormatDecimal.convertToForamt(getTotal(), 100)+"; ";
		
	}
	
	
	
	

}
