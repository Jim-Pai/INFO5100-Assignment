/*

Scenario : Drive home
Description : A student is driving from school.

Objects (with States and behaviors) :
	Object : Student
		State : name
		Behavior : openGoogleMap(), setUpLocation(), driveCarToDestination()

	Object : GoogleMap
		State :	departureLocation, arrivalLocation, estimatedTime
		Behavior : displayShortestPath()
	
	Object : Car
		State : type, color 
	
*/

public class DriveHome {

	public static void main(String[] args) {
		Student jim = new Student();
		jim.name = "Jim";
		
		GoogleMap googlemap = new GoogleMap();
		jim.openGoogleMap(googlemap);
		String departureLocation = "School";
		String arrivalLocation = "Home";
		jim.setUpLocation(departureLocation, arrivalLocation);
		googlemap.displayShortestPath();
		Car car = new Car();
		car.brand = "Toyota";
		car.color = "Silver";
		jim.driveCarToDestination(car, arrivalLocation);
	}

}

class Student{
	String name;
	void openGoogleMap(GoogleMap gm){}
	void setUpLocation(String departureLocation, String arrivalLocation){}
	void driveCarToDestination(Car car, String destination){}
}

class GoogleMap{
	String departureLocation, arrivalLocation;
	int estimatedTime;
	void displayShortestPath(){}
}

class Car{
	String brand, color;
}