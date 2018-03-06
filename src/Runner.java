import by.gsu.asoilab.AbstractPurchase;
import by.gsu.asoilab.Commodity;
import by.gsu.asoilab.FormatDecimal;
import by.gsu.asoilab.PurchaseDiscountPercent;
import by.gsu.asoilab.PurchaseDiscountPrice;

public class Runner {
	public static void main(String[] args) {
		AbstractPurchase[] purchases = {
				new PurchaseDiscountPrice(new Commodity("Milk",300), 2, 10),
				new PurchaseDiscountPrice(new Commodity("Bread",450), 3, 25),
				new PurchaseDiscountPrice(new Commodity("Bird",5555), 1, 255),
				new PurchaseDiscountPercent(new Commodity("Book",4590), 1, 13),
				new PurchaseDiscountPercent(new Commodity("Leek",475), 3, 3),
				new PurchaseDiscountPercent(new Commodity("Flower",450), 1, 5)
		};
		
		int totalCost = 0;
		AbstractPurchase purchaseWithMinCost = null;
		
		for(int i=0;i<purchases.length;i++) {
			if(i==0) {
				purchaseWithMinCost = purchases[i];
			}
			else {
				if(purchases[i].getCost()<purchaseWithMinCost.getCost()) {
					purchaseWithMinCost = purchases[i];
				}
			}
			System.out.println(purchases[i]);
			totalCost+=purchases[i].getCost();
		
		}
		
		System.out.println("\n"+FormatDecimal.convertToForamt(totalCost, 100));
		
		System.out.println("\n"+purchaseWithMinCost);
		
		
		
		
	}

}
