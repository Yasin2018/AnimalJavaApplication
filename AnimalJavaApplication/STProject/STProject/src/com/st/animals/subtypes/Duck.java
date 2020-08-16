package com.st.animals.subtypes;

import com.st.animals.types.Birds;

public class Duck extends Birds{
    
	
	private Duck(){
		
	}
	public  Duck(int animalId,String name, String type ){
		this.setAnimalId(animalId);
		this.setName(name);
		this.setType(type);
		setSingSound("Cluck, cluck");
	}
	
	public void setCanSwim(boolean canSwim) {
		// TODO Auto-generated method stub
		canSwim=true;
	}
	
	public void Swim(String swim) {
		System.out.println("Duck is Swimming...");
		
	}
	
	
	

}
