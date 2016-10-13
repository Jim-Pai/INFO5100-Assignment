package assignment5;

import java.util.Vector;

public class Checkout {
	Vector dessertItems;
	
	public Checkout() {
		dessertItems = new Vector(5, 2);
	}
	
	public int numberOfItems() {
		return dessertItems.size();
	}
	
	public void enterItem(DessertItem item) {
		dessertItems.addElement(item);
	}
	
	public void clear() {
		dessertItems.clear();
	}
	
	public int totalCost() {
		int sum = 0;
		DessertItem dessert;
		for(int i = 0; i < numberOfItems(); i++){
			dessert = (DessertItem)dessertItems.get(i);
			sum += dessert.getCost();
		}
		//return total cost in cents(without tax)
		return sum;
	}
	
	public int totalTax() {
		//return total tax in cents
		return Math.round(totalCost() * DessertShoppe.TAX_RATE / 100);
	}
	
	@Override
	public String toString() {
		StringBuffer receipt = new StringBuffer();
		DessertItem dessert;
		
		//title
		int frontSpaceNum = DessertShoppe.maxSizeOfItemName - DessertShoppe.storeName.length();
		receipt.append(DessertShoppe.mutipleSpace(frontSpaceNum));
		receipt.append(DessertShoppe.storeName + "\n");
		//divider
		String divider = "--------------------";
		frontSpaceNum = DessertShoppe.maxSizeOfItemName - divider.length();
		receipt.append(DessertShoppe.mutipleSpace(frontSpaceNum));
		receipt.append(divider + "\n");
		//get item detail
		for(int i = 0; i < numberOfItems(); i++){
			dessert = (DessertItem)dessertItems.get(i);
			receipt.append(dessert.toString());
		}
		receipt.append("\n");
		String Title = "Tax";
		int spaceNum = DessertShoppe.maxSizeOfItemName - Title.length() 
						+ DessertShoppe.widthDisplayCost - DessertShoppe.cents2dollarsAndCents(totalTax()).length();
		receipt.append(Title + DessertShoppe.mutipleSpace(spaceNum));
		receipt.append(DessertShoppe.cents2dollarsAndCents(totalTax()) + "\n");
		
		Title = "Total Cost";
		spaceNum = DessertShoppe.maxSizeOfItemName - Title.length() 
					+ DessertShoppe.widthDisplayCost - DessertShoppe.cents2dollarsAndCents(totalCost()).length();
		receipt.append(Title + DessertShoppe.mutipleSpace(spaceNum));
		receipt.append(DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax()) + "\n");
		
		return receipt.toString();
	}
}
