package assignment6;

public class Cat extends Pet implements Boardable{
	private String hairLength;
	// Inconvenient way to deal with date
	private int boardStartMonth, boardStartDay, boardStartYear = 0;
	private int boardEndMonth, boardEndDay, boardEndYear = 0;
	
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}
	
	public String getHairLength(){
		return hairLength;
	}
	
	public void setBoardStart(int month, int day, int year){
		boardStartMonth = month;
		boardStartDay = day;
		boardStartYear = year;
	}
	
	public void setBoardEnd(int month, int day, int year){
		boardEndMonth = month;
		boardEndDay = day;
		boardEndYear = year;
	}
	
	public boolean boarding(int month, int day, int year){
		if(year > boardStartYear && year < boardEndYear){
			return true;
		}
		else if(year == boardStartYear){
			if(month > boardStartMonth){
				return true;
			}
			else if(month == boardStartMonth){
				if(day >= boardStartDay){
					return true;
				}
			}
		}
		else if(year == boardEndYear){
			if(month < boardEndMonth){
				return true;
			}
			else if(month == boardEndMonth){
				if(day <= boardEndDay){
					return true;
				}
			}
		}
		
		return false;
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
