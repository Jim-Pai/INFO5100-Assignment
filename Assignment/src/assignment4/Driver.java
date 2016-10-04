package assignment4;

public class Driver {

	String name;
	private Car car = null;
	
	public Driver(String name){
		this.name = name;
	}
	
	public void buyNewCar(){
		car = new Car();
	}
	
	public void buyNewCar(Color color, String brand){
		car = new Car(color, brand);
	}
	
	public void addGas(double amount){
		if(car == null){
			System.out.println("Please buy a car at first.");
			return;
		}
			
		car.addGas(amount);
	}
	
	public void driveCar(){
		if(car == null){
			System.out.println("Please buy a car at first.");
			return;
		}
			
		car.run();
	}
}
