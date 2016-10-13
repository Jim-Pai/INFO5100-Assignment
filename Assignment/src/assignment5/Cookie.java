package assignment5;

public class Cookie extends DessertItem{
	
	protected int amount;
	protected int pricePerDozen;
	
	public Cookie(String name, int amount, int pricePerDozen){
		this.name = name;
		this.amount = amount;
		this.pricePerDozen = pricePerDozen;
	}

	@Override
	public int getCost() {
		float dozen = amount / 12f;
		return Math.round(dozen * pricePerDozen);
	}
	
	@Override
	public String toString(){
		StringBuffer detailOnReceipt = new StringBuffer();
		detailOnReceipt.append(amount + " @ " + DessertShoppe.cents2dollarsAndCents(pricePerDozen) + " /dz.\n");
		detailOnReceipt.append(DessertShoppe.receiptDetailFormatter(name, getCost()));
		return detailOnReceipt.toString();
	}
	
}
