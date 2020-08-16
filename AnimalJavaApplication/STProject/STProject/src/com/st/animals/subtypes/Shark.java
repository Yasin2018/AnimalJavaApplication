package com.st.animals.subtypes;

import com.st.animals.types.Fish;

public class Shark extends Fish{
	private Shark(){
		
	}
	public  Shark(int animalId,String name, String type ){
		this.setAnimalId(animalId);
		this.setName(name);
		this.setType(type);
		
	}
}
