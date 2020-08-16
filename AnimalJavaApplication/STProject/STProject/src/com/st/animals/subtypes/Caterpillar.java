package com.st.animals.subtypes;

import com.st.animals.types.Birds;

public class Caterpillar extends Birds{
	private Caterpillar(){
		
	}
	public  Caterpillar(int animalId,String name, String type ){
		this.setAnimalId(animalId);
		this.setName(name);
		this.setType(type);
		
	}
	
	@Override
	public void Fly() {
		System.out.println("caterpillar cannot fly...");
		
	}

	@Override
	public void Sing() {
		System.out.println("caterpillar cannot sing...");
		
	}
}
