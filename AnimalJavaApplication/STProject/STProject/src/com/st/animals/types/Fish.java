package com.st.animals.types;

import com.st.animals.Animal;

public  class Fish extends Animal{
	
	
	public  Fish(int animalId,String name, String type ){
		
		this.setAnimalId(animalId);
		this.setName(name);
		this.setType(type);
		
	}
	
	 public Fish(){
	    	setCanSwim(true);
	    	setCanFly(false);
	    	setCanWalk(false);
	    	setCanSing(false);
	    	
	    }
	
	

	@Override
	public void Walk() {
		System.out.println(getName()+"Fish cannot walk...");
		
	}

	@Override
	public void Fly() {
		System.out.println(getName()+"Fish cannot fly...");
		
	}

	@Override
	public void Sing() {
		System.out.println(getName()+"Fish cannot sing...");
		
	}

	@Override
	public  void Swim() {
		System.out.println(getName()+"Fish can swim...");
	};

}
