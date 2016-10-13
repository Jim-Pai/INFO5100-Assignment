package assignment5;

public class Sundae extends IceCream{
	
	protected String toppingName;
	protected int toppingPrice;
	
	public Sundae(String iceCreamType, int iceCreamPrice, String toppingName, int toppingPrice){
		name = iceCreamType;
		price = iceCreamPrice;
		this.toppingName = toppingName;
		this.toppingPrice = toppingPrice;
	}
	
	@Override
	public int getCost() {
		return price + toppingPrice;
	}
	
	@Override
	public String toString(){
		StringBuffer detailOnReceipt = new StringBuffer();
		String fullName = toppingName + " Sundae with \n" + name;
		detailOnReceipt.append(DessertShoppe.receiptDetailFormatter(fullName, getCost()));
		return detailOnReceipt.toString();
	}
}
