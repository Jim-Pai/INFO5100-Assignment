package assignment1;
/*

Scenario : Booking an Airbnb
Description : A tourist wants to book a house on Airbnb app.

Objects (with States and behaviors) :
	Object : Tourist
		State : name, phoneNumber, EmailAddress
		Behavior : loginAirbnb(), findTheHouseInterestedIn(), bookHouse(), payMoneyToHouseholder()

	Object : Airbnb app
		State : Collection of houses, location, date
		Behavior : SetFilterCondition(), displayAvailableHouse(), , getCommissionFromHouseholder()
		
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
		jim.phoneNumber = "1234567890";
		jim.EmailAddress = "jim@husky.neu.edu";
		
		Airbnb airbnb = new Airbnb();
		jim.loginAirbnb(airbnb);
		
		String location = "Seattle";
		String date = "09/13/2016";
		airbnb.SetFilterCondition(location, date);
		
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
	String name, phoneNumber, EmailAddress;
	void loginAirbnb(Airbnb air){}
	House findTheHouseInterestedIn(House[] house){}
	void bookHouse(House house){}
	Money payMoneyToHouseholder(Householder hh){}
}

class Airbnb{
	House[] houses;
	String location, date;
	void SetFilterCondition(String location, String date){}
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