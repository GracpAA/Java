import by.gsu.asoilab.Purchase;

public class Runner2 {
	
	public static void main(String[] args) {
		
		Purchase purchase = new Purchase("magazine", 15000,5);
		System.out.println(purchase);
		purchase.setNumberOfUnits(3);
		System.out.println(purchase.getCost());
	}
}
