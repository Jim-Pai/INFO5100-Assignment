package assignment4;

public class GasTank {

	private double amount;
	
	public GasTank(){
		this.amount = 0;
	}
	
	public void addGas(double amount){
		this.amount += amount;
	}
	
	public void useGas(double amount){
		if(this.amount > amount){
			this.amount -= amount;
			System.out.println("Use " + amount + " gas, and the current gas level is " + getGasLevel() + " .");
		}
		else{
			this.amount = 0;
			System.out.println("Run out of gas!");
		}
	}
	
	public double getGasLevel(){
		return this.amount;
	}
	
}
