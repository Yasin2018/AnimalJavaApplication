package com.st.animals.subtypes;

import com.st.animals.types.Fish;

public class ClownFish extends Fish {
	private ClownFish(){
		
	};
	
	public  ClownFish(int animalId,String name, String type ){
		this.setAnimalId(animalId);
		this.setName(name);
		this.setType(type);
		
	}
}
