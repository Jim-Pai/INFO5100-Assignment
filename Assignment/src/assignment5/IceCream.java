package assignment5;

public class IceCream extends DessertItem{
	
	protected int price;
	
	public IceCream() {
		
	}
	
	public IceCream(String name, int price){
		this.name = name;
		this.price = price;
	}

	@Override
	public int getCost() {
		return price;
	}
	
	@Override
	public String toString(){
		StringBuffer detailOnReceipt = new StringBuffer();
		detailOnReceipt.append(DessertShoppe.receiptDetailFormatter(name, getCost()));
		return detailOnReceipt.toString();
	}
}
