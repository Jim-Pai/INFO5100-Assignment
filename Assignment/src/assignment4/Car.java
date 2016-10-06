package assignment4;

public class Car {
	
	private static final double GAS_COST_RATE = 2;
	private double gasAmount;
	private Color color;
	private String brand;
	
	// Constructors
	public Car(){
		this(0, Color.WHITE, "Toyota");
	}
	
	public Car(double gasAmount, Color color, String brand){
		this.gasAmount = gasAmount;
		this.color = color;
		this.brand = brand;
		System.out.println("You got a " + this.brand + " car, and the color is " + this.color);
	}
	// Getter
	public double getGasLevel() {
		return this.gasAmount;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public String getBrand(){
		return this.brand;
	}
	// End of getter
	// Setter
	public void setGasLevel(double amount) {
		this.gasAmount = amount;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	// End of setter
	public void addGas(double amount){
		this.gasAmount += amount;
	}
	
	public void useGas(double amount){
		if(this.gasAmount > amount){
			this.gasAmount -= amount;
			System.out.println("Use " + amount + " gas, and the current gas level is " + getGasLevel() + " .");
		}
		else{
			this.gasAmount = 0;
			System.out.println("Run out of gas!");
			stop();
		}
	}
	
	public void run(){
		System.out.println("The car is running......");
		
		while(getGasLevel() > 0){
			useGas(GAS_COST_RATE);
		}
	}
	
	public void stop(){
		System.out.println("The car just stopped......");
	}
}

enum Color{
	WHITE, BLACK, SILVER
};
