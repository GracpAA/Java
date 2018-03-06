
import by.gsu.asoilab.Purchase;

public class Runner {
	
	public static void main(String[] args) {
		Purchase[] purchases = {
				new Purchase("Book", 70000, 5),
				new Purchase("Book", 70000, 12)
		};
		
		printArray(purchases);
		
		purchases[1].setName("Magazine");
		purchases[1].setPrice(25000);
		
		System.out.println(purchases[1].getCost());
		
		Purchase purchase = purchases[1];
		purchases[1]=purchases[0];
		purchases[0]=purchase;
		
		printArray(purchases);
		
		
	}
	
	private static void printArray(Purchase[] purchases) {
		for(Purchase purchase: purchases) {
			System.out.println(purchase);
		}
	}

}
