/*

Scenario : Booking an Airbnb
Description : A tourist wants to book a house on Airbnb app.

Objects (with States and behaviors) :
	Object : Tourist
		State : name, location, date
		Behavior : loginAirbnb(), findTheHouseInterestedIn(), bookHouse(), payMoneyToHouseholder()

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
		jim.location = "Seattle";
		jim.date = "09/13/2016";
		
		Airbnb airbnb = new Airbnb();
		jim.loginAirbnb(airbnb);
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
	String location;
	String date;
	void loginAirbnb(Airbnb air){}
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