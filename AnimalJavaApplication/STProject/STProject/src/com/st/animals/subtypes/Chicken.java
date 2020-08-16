package com.st.animals.subtypes;

import com.st.animals.types.Birds;

public class Chicken extends Birds{
    
	
	public  Chicken(int animalId,String name, String type ){
		this.setAnimalId(animalId);
		this.setName(name);
		this.setType(type);
		setCanFly(false);
		setSingSound("Cluck, cluck");
	}
	
	
	public void Fly() {
		System.out.println("Chicken cannot fly...");
		
	}
	
	
	
	

	
		
	
	
	

}
