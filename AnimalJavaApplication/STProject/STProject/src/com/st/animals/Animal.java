package com.st.animals;

import com.st.animals.subtypes.Duck;

public abstract class Animal {
	
	private String name;
	private String type;
	private int animalId;
	public int getAnimalId() {
		return animalId;
	}
	
	

	

	private boolean canWalk;
	public boolean isCanWalk() {
		return canWalk;
	}

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public boolean isCanSing() {
		return canSing;
	}

	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}





	private boolean canSwim;
	private boolean canSing;
	private boolean canFly;
	
	public String getName() {
		return name;
	}
	
	
	
	
	

	public abstract void Walk();
	
	public abstract void Fly() ;
	
	public abstract void Sing();
	
	public abstract void Swim() ;
	
	

	public void setName(String name) {
		this.name=name;
		
	}




	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAnimalId(int animalId) {
		// TODO Auto-generated method stub
		this.animalId=animalId;
	}
	
	
	

}
