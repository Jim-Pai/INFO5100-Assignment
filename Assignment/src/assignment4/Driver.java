package assignment4;

public class Driver {

	private String name;
	private Car car = null;
	
	public Driver(String name){
		this.name = name;
	}
	
	public void buyNewCar(String plateNumber, Color color, String brand){
		car = new Car(plateNumber, color, brand);
	}
	
	public void addGas(double amount){
		if(car == null){
			System.out.println("Please buy a car at first.");
			return;
		}
			
		car.getGasTank().addGas(amount);
	}
	
	public void driveCar(){
		if(car == null){
			System.out.println("Please buy a car at first.");
			return;
		}
			
		car.run();
	}
}
