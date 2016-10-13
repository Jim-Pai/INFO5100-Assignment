package assignment5;

import java.text.NumberFormat;

public class Candy extends DessertItem{
	
	protected float weight;
	protected int pricePerPound;
	
	public Candy(String name, double weight, int pricePerLb){
		this.name = name;
		this.weight = (float)weight;
		this.pricePerPound = pricePerLb;
	}

	@Override
	public int getCost() {
		return Math.round(weight * pricePerPound);
	}
	
	@Override
	public String toString(){
		StringBuffer detailOnReceipt = new StringBuffer();
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setMinimumFractionDigits(2);
		detailOnReceipt.append(numberFormat.format(weight) + " lbs. @ " + DessertShoppe.cents2dollarsAndCents(pricePerPound) + " /lb.\n");
		detailOnReceipt.append(DessertShoppe.receiptDetailFormatter(name, getCost()));
		return detailOnReceipt.toString();
	}
}
