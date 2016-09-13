/*

Scenario : Drive home
Description : A student is driving from school.

Objects (with States and behaviors) :
	Object : Student
		State : name
		Behavior : openGoogleMap(), driveCarToDestination()

	Object : GoogleMap
		State :	departureLocation, arrivalLocation, estimatedTime
		Behavior : setUpLocation(), displayShortestPath()
	
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
		googlemap.setUpLocation(departureLocation, arrivalLocation);
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
	void driveCarToDestination(Car car, String destination){}
}

class GoogleMap{
	String departureLocation, arrivalLocation;
	int estimatedTime;
	void setUpLocation(String departureLocation, String arrivalLocation){}
	void displayShortestPath(){}
}

class Car{
	String brand, color;
}