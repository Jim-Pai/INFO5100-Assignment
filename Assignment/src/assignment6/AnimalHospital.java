package assignment6;

import java.util.ArrayList;

public class AnimalHospital {
	private ArrayList<Pet> petList = new ArrayList<Pet>();
	
	public AnimalHospital(String inputFile){
		
	}
	
	public void petBoard(Pet p){
		petList.add(p);
	}
	
	public void printPetInfoByName(String name){
		for(Pet p: petList){
			if(p.getPetName().equals(name))
				System.out.println(p.toString());
		}
	}
	
	public void printPetInfoByOwner(String name){
		for(Pet p: petList){
			if(p.getOwnerName().equals(name))
				System.out.println(p.toString());
		}
	}
	
	public void printPetsBoarding(int month, int day, int year){
		for(Pet p: petList){
			Boardable boardable = (Boardable)p;
			if(boardable.boarding(month, day, year))
				System.out.println(p.toString());
		}
	}
	
}
