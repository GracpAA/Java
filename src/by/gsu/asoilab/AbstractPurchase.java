package by.gsu.asoilab;

public abstract class AbstractPurchase{
	
	private int count;
	private Commodity commodity;
	
	public AbstractPurchase(){
		
	}
	
	public AbstractPurchase(Commodity commodity, int count) {
		this.commodity = commodity;
		this.count = count;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public Commodity getCommodity() {
		return commodity;
	}
	
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	
	public abstract int getCost();
	
	@Override
	public String toString() {
		
		return commodity+"; "+getCount()+"; "+FormatDecimal.convertToForamt(getCost(), 100);
		
	}
	
	

}
