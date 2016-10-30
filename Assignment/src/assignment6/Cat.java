package assignment6;

import java.util.GregorianCalendar;

public class Cat extends Pet implements Boardable{
	private String hairLength;
	private GregorianCalendar boardStart = new GregorianCalendar();
	private GregorianCalendar boardEnd = new GregorianCalendar();
	
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}
	
	public String getHairLength(){
		return hairLength;
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
		sb.append("CAT:\n");
		sb.append(getPetName() + " owned by " + getOwnerName() + "\n");
		sb.append("Color: " + getColor() + "\n");
		sb.append("Sex: " + getSex() + "\n");
		sb.append("Hair: " + hairLength + "\n");
		return sb.toString();
	}
	
}
