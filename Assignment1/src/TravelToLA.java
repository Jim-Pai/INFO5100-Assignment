/*

Scenario : Travelling to LA
Description : A tourist is trying to find the cheapest flight to LA.

Objects (with States and behaviors) :
	Object : Tourist
		State : name
		Behavior : visitFlightCompareWebsite(), findCheapestFlight(), 

	Object : FlightCompareWebsite
		State : Collection of flights, departureTime, departureLocation, arrivalLocation
		Behavior : setFilterCondition(), displayAvailableFlight()

	Object : Flight
		State : price, departureTime, departureLocation, arrivalTime, arrivalLocation
		Behavior : getPrice()

*/


public class TravelToLA {

	public static void main(String[] args) {
		Tourist jim = new Tourist();
		jim.name = "Jim";
		
		FlightCompareWebsite googleflight = new FlightCompareWebsite();
		jim.visitFlightCompareWebsite(googleflight);
		
		String departureTime = "09/02/2016";
		String departureLocation = "Taiwan";
		String arrivalLocation = "LA";
		googleflight.setFilterCondition(departureTime, departureLocation, arrivalLocation);
		Flight[] flights = googleflight.displayAvailableFlight();
		Flight cheapestFlight = jim.findCheapestFlight(flights);
	}

}

class Tourist{
	String name;
	void visitFlightCompareWebsite(FlightCompareWebsite fcw){}
	Flight findCheapestFlight(Flight[] flights){}
}

class FlightCompareWebsite{
	Flight[] flights;
	String departureTime, depatureLocation, arrivalLocation;
	void setFilterCondition(String departureTime, String depatureLocation, String arrivalLocation){}
	Flight[] displayAvailableFlight(){}
}

class Flight{
	float price;
	String departureTime, departureLocation, arrivalTime, arrivalLocation;
	void getPrice(){}
}
