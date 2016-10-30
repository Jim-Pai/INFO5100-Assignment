package assignment6;

import java.util.GregorianCalendar;

public class Dog extends Pet implements Boardable{
	private String size;
	// Simpler way to deal with date 
	private GregorianCalendar boardStart = new GregorianCalendar();
	private GregorianCalendar boardEnd = new GregorianCalendar();
	
	public Dog(String name, String ownerName, String color, String size){
		super(name, ownerName, color);
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setBoardStart(int month, int day, int year){
		boardStart.clear();
		boardStart.set(year, month, day);
	}
	
	public void setBoardEnd(int month, int day, int year){
		boardEnd.clear();
		boardEnd.set(year, month, day);
	}
	
	public boolean boarding(int month, int day, int year){
		GregorianCalendar time = new GregorianCalendar();
		time.clear();
		time.set(year, month, day);
		
		if(time.after(boardStart) && time.before(boardEnd)){
			return true;
		}
		else if(time.equals(boardStart) || time.equals(boardEnd)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("DOG:\n");
		sb.append(getPetName() + " owned by " + getOwnerName() + "\n");
		sb.append("Color: " + getColor() + "\n");
		sb.append("Sex: " + getSex() + "\n");
		sb.append("Size: " + size + "\n");
		return sb.toString();
	}
	
}
