package by.gsu.asoilab;

public class PurchaseDiscountPercent extends AbstractPurchase {
	
private int discount;
	
    public PurchaseDiscountPercent() {
		// TODO Auto-generated constructor stub
	}
    
	public PurchaseDiscountPercent(Commodity commodity, int count, int discount) {
		super(commodity, count);
		this.discount = discount;
	}

	@Override
	public int getCost() {	
		return getCommodity().getPrice()*getCount()*(100-discount)/100;
		
	}

	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
