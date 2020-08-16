package com.st.animals.subtypes;

import com.st.animals.types.Birds;

public class Parrot extends Birds{
	
	private Parrot(){
		
	};

	public  Parrot(int animalId,String name, String type,String singSound ){
		this.setAnimalId(animalId);
		this.setName(name);
		this.setType(type);
		setSingSound(singSound);
	}
	
}
