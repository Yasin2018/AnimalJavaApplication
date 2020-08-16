package com.st.animals.subtypes;

import com.st.animals.types.Birds;

public class Butterfly extends Birds{
	private Butterfly(){
		
	}

	public  Butterfly(int animalId,String name, String type ){
		this.setAnimalId(animalId);
		this.setName(name);
		this.setType(type);
		
	}
	
	@Override
	public void Walk() {
		System.out.println("Butterfly cannot walk...");
		
	}

	@Override
	public void Sing() {
		System.out.println("Butterfly cannot sing...");
		
	}
	
}
