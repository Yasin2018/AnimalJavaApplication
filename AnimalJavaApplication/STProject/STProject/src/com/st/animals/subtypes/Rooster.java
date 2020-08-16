package com.st.animals.subtypes;

public class Rooster {
	static Chicken chicken=null;
	public static Chicken getChicken() {
		return chicken;
	}

	public static void setChicken(Chicken chicken) {
		Rooster.chicken = chicken;
	}

	static Rooster rooster=null;
	private Rooster(){
	 chicken=new Chicken(002,"Rooster is male form of chicken","Male");

	}
	
	public static Rooster getRooster(){
		chicken= new Chicken(002,"Rooster is male form of chicken","Male");
		chicken.setSingSound("Cock-a-doodle-doo");
		rooster=new Rooster();
		rooster.setChicken(chicken);
		return rooster;
		}
	
	
	
	
}
