package assignment4;

public class Car {

	private double gasAmount;
	private Color color;
	private String brand;
	
	public Car(){
		this(Color.WHITE, "Toyota");
	}
	
	public Car(Color color, String brand){
		this.color = color;
		this.brand = brand;
		this.gasAmount = 0;
		System.out.println("You got a " + this.brand + " car, and the color is " + this.color);
	}
	
	public double getGasLevel() {
		return this.gasAmount;
	}
	
	public void addGas(double amount){
		this.gasAmount += amount;
	}
	
	public void useGas(double amount){
		if(this.gasAmount > amount){
			this.gasAmount -= amount;
			System.out.println("Use " + amount + " gas, and the current gas level is " + this.gasAmount + " .");
		}
		else{
			this.gasAmount = 0;
			System.out.println("Run out of gas!");
			stop();
		}
	}
	
	public void run(){
		System.out.println("The car is running......");
		
		while(this.gasAmount > 0){
			useGas(2);
		}
	}
	
	public void stop(){
		System.out.println("The car just stopped......");
	}
}

enum Color{
	WHITE, BLACK, SILVER
};
