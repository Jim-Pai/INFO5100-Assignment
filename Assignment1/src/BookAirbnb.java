/*

Scenario : Booking an Airbnb
Description : A tourist wants to book a house on Airbnb app.

Objects (with States and behaviors) :
	Object : Tourist
		State : name, location, date
		Behavior : loginAirbnb(), SetFilterCondition(), findTheHouseInterestedIn(), bookHouse(), payMoneyToHouseholder()

	Object : Airbnb app
		State : Collection of houses
		Behavior : displayAvailableHouse(), , getCommission()
		
	Object : House
		State : location, price, householder
		Behavior : getLocation(), getPrice(), getHouseholder()
	
	Object : HouseHolder
		State : name
		Behavior : acceptMoneyFromTourist()
	
	Object : Money
		State : amount
	
*/

public class BookAirbnb {

	public static void main(String[] args) {
		Tourist jim = new Tourist();
		jim.name = "Jim";
		
		Airbnb airbnb = new Airbnb();
		jim.loginAirbnb(airbnb);
		
		String location = "Seattle";
		String date = "09/13/2016";
		jim.SetFilterCondition(location, date);
		
		House[] houses = airbnb.displayAvailableHouse();
		House houseInterestedIn = jim.findTheHouseInterestedIn(houses);
		jim.bookHouse(houseInterestedIn);
		Householder householder = houseInterestedIn.getHouseholder();
		Money money = jim.payMoneyToHouseholder(householder);
		householder.acceptMoneyFromTourist(money, jim);
		airbnb.getCommissionFromHouseholder(householder);
	}

}

class Tourist{
	String name;
	void loginAirbnb(Airbnb air){}
	void SetFilterCondition(String location, String date){}
	House findTheHouseInterestedIn(House[] house){}
	void bookHouse(House house){}
	Money payMoneyToHouseholder(Householder hh){}
}

class Airbnb{
	House[] houses;
	House[] displayAvailableHouse(){}
	void getCommissionFromHouseholder(Householder hh){}
}

class House{
	String location;
	float price;
	Householder householder;
	String getLocation(){}
	float getPrice(){}
	Householder getHouseholder(){}
}

class Householder{
	String name;
	void acceptMoneyFromTourist(Money m, Tourist t){}
}

class Money{
	float amount;
}