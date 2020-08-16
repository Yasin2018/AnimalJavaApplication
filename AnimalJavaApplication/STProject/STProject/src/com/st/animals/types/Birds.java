package com.st.animals.types;

import com.st.animals.Animal;

public abstract  class Birds extends Animal{

	
    public Birds(){
    	setCanSwim(false);
    	setCanFly(true);
    	setCanWalk(true);
    	setCanSing(true);
    	
    }
    
    String singSound="general sound";
	

	public String getSingSound() {
		return singSound;
	}

	public  void setSingSound(String singsound){
		this.singSound=singsound;
	};

	@Override
	public void Walk() {
		System.out.println(getName()+"Bird is walking...");
		
	}

	@Override
	public void Fly() {
		System.out.println(getName()+"Bird is flying...");
		
	}

	@Override
	public void Sing() {
		System.out.println(getName()+"Singing like ..."+getSingSound());
		
	}

	@Override
	public void Swim() {
		System.out.println(getName()+"Bird cannot swim...");
		
	}
	
}
