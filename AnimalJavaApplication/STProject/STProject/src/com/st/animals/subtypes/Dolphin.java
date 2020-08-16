package com.st.animals.subtypes;

import com.st.animals.Animal;
import com.st.animals.types.Fish;

public class Dolphin {
	static Fish fish;
	public static Fish getFish() {
		return fish;
	}
	public static void setFish(Fish fish) {
		Dolphin.fish = fish;
	}
	static Dolphin dolphin=null;
	private Dolphin(){
		
	}
public static Dolphin getDolphin(){
	fish =new Fish(003,"Dolphin","dolphin specil type of fish");
	dolphin=new Dolphin();
	dolphin.setFish(fish);
	return dolphin;
	};
	
	
	
	
}
