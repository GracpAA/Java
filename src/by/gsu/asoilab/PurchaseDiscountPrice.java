package by.gsu.asoilab;

public class PurchaseDiscountPrice extends AbstractPurchase {
	
	private int discount;
	
    public PurchaseDiscountPrice() {
	// TODO Auto-generated constructor stub
}
	
	public PurchaseDiscountPrice(Commodity commodity, int count, int discount) {
		super(commodity,count);
		this.discount = discount;
	}
	
	@Override
	public int getCost() {
		return getCommodity().getPrice()*getCount()-discount;	
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
