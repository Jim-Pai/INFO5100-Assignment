package assignment4;

public class Car {
	
	private static final double GAS_COST_RATE = 2;
	private GasTank gasTank;
	private String plateNumber;
	private Color color;
	private String brand;
	
	// Constructors
	public Car(String plateNumber, Color color, String brand){
		this.plateNumber = plateNumber;
		this.color = color;
		this.brand = brand;
		gasTank = new GasTank();
		System.out.println("You got a " + this.brand + " car, and the color is " + this.color);
		System.out.println("Plate Number is " + plateNumber);
	}
	// Getter
	public String getPlateNumber() {
		return this.plateNumber;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public String getBrand(){
		return this.brand;
	}
	// End of getter
	// Setter
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	// End of setter
	public void addGas(double amount){
		gasTank.addGas(amount);;
	}
	
	public void run(){
		System.out.println("The car is running......");
		
		while(gasTank.getGasLevel() > 0){
			gasTank.useGas(GAS_COST_RATE);
		}
		
		stop();
	}
	
	public void stop(){
		System.out.println("The car just stopped......");
	}
}

enum Color{
	WHITE, BLACK, SILVER
};
