package by.gsu.asoilab;

public class Purchase implements Comparable<Object>{
	
	public static final String PURCHASE_NAME = "MILK";
	public static final int PRICE = 1234;
	private int countOfPurchase;
	private Day dayOfWeek;
	
	public Purchase() {
		
	}
	
	public  Purchase(int countOfPurchase, Day dayOfWeek) {
	
		this.countOfPurchase = countOfPurchase;
		this.dayOfWeek = dayOfWeek;
		
	}
	
	public Day getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(Day dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public int getCountOfPurchase() {
		return countOfPurchase;
	}
	public void setCountOfPurchase(int countOfPurchase) {
		this.countOfPurchase = countOfPurchase;
	}
	
	public int getCost(){
		return PRICE*countOfPurchase;	
	}
	
	@Override
	public String toString() {
		return countOfPurchase+"; "+dayOfWeek.getName()+"; ";
	}
	
	@Override
	public int compareTo(Object purchase) {
		Purchase p = (Purchase)purchase;
	    if(countOfPurchase<p.countOfPurchase) return -1;
	    else if (countOfPurchase<p.countOfPurchase) return 1;
	    else return 0;
	}


}
