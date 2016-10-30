package assignment6;

public class Pet {
	private String name;
	private String ownerName;
	private String color;
	protected int sex;
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	public static final int SPAYED = 3;
	public static final int NEUTERED = 4;
	
	public Pet(String name, String ownerName, String color){
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName(){
		return name;
	}
	
	public String getOwnerName(){
		return ownerName;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setSex(int sexid){
		if(sexid > 4 || sexid < 1)
			System.out.println("Invalid Sex ID.");
		else
			sex = sexid;
	}
	
	public String getSex(){
		String sexString;
		
		switch (sex) {
		case MALE:
			sexString = "MALE";
			break;
		case FEMALE:
			sexString = "FEMALE";
			break;
		case SPAYED:
			sexString = "SPAYED";
			break;
		case NEUTERED:
			sexString = "NEUTERED";
			break;
		default:
			sexString = "";
			break;
		}
		
		return sexString;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(name + " owned by " + ownerName + "\n");
		sb.append("Color: " + color + "\n");
		sb.append("Sex: " + getSex() + "\n");
		return sb.toString();
	}
	
}







