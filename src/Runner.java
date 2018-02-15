import java.lang.reflect.Array;
import java.util.Arrays;

import by.gsu.asoilab.Day;
import by.gsu.asoilab.FormatDecimal;
import by.gsu.asoilab.Purchase;

public class Runner {
	
	public static void main(String[] args) {
		
		Purchase[] purchases = {
				new Purchase(1,Day.MONDAY),
				new Purchase(2,Day.TUESDAY),
				new Purchase(1,Day.WEDNESDAY),
				new Purchase(4,Day.SUNDAY),
				new Purchase(3,Day.SATURDAY)
		};
		
		System.out.println("Name of purchase "+Purchase.PURCHASE_NAME+"; Price of purchese "+Purchase.PRICE+"\n");
		
		int totalCostPerWeek = 0,totalCostPerMonday = 0;
		Purchase purchaseWithMaxCost = new Purchase();
		
		for(Purchase purchase: purchases) {
			System.out.println(purchase);
			totalCostPerWeek += purchase.getCost();
			if(purchase.getDayOfWeek()==Day.MONDAY) {
				totalCostPerMonday += purchase.getCost();
			}
			
			if(purchaseWithMaxCost.getCost()<purchase.getCost()) {
				purchaseWithMaxCost = purchase;
			}
		}
		
		System.out.println("\nmean cost of all purchases = " + FormatDecimal.convertToForamt(totalCostPerWeek, 100, 2)+"; Cost of all purchases in monday = "+FormatDecimal.convertToForamt(totalCostPerMonday, 100, 2)+"; Day with the maximum cost purchase = " + purchaseWithMaxCost.getDayOfWeek().getName()+"\n");
		Arrays.sort(purchases);
		
		for(Purchase purchase: purchases) {
			System.out.println(purchase);
		}
		
		
		
		
		
	}
	

}
