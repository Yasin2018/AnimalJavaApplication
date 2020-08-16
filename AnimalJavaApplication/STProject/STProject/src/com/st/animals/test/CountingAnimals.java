package com.st.animals.test;
import java.util.ArrayList;
import java.util.List;

import com.st.animals.Animal;
import com.st.animals.subtypes.*;
import com.st.animals.types.Fish;
public class CountingAnimals {
   
	Butterfly bf=null;
	   Caterpillar cp=null;
	   Chicken chk=null;
	   Chicken rooster=null;
	   ClownFish cf=null;
	   Dolphin dp=null;
	   Duck duck=null;
	   Parrot parrwithDog=null;
	   Parrot parrwithCat=null;
	   Parrot parrwithRooster=null;
	   
	   Shark shark=null;
	   List<Animal> animalList=new ArrayList<Animal>();
	  
   public CountingAnimals(){
	    bf=new Butterfly(1,"Butterfly","Bird type is butterfly");
	    cp=new Caterpillar(2,"Caterpillar","Baby form of Butterfly");
	    chk=new Chicken(3,"Chicken","Bird type chicken");
	    cf=new ClownFish(4,"Clownfish","Fish type Clownfish");
	    Fish dolphin=Dolphin.getDolphin().getFish();
	    duck=new Duck(5,"Duck","Bird type Duck");
	    parrwithDog=new Parrot(6,"Parrort","parrot with dog","Woof, woof");
	    parrwithCat=new Parrot(7,"Parrort","parrot with cat","Meow");
	    parrwithRooster=new Parrot(8,"Parrort","parrot with rooster","Cock-a-doodle-doo");
	    rooster=Rooster.getRooster().getChicken();
	    shark=new Shark(007,"fish type shark","type of fish");
	    animalList.add(bf);
	    animalList.add(cp);
	    animalList.add(chk);
	    animalList.add(cf);
	    animalList.add(dolphin);
	    animalList.add(duck);
	    animalList.add(parrwithDog);
	    animalList.add(parrwithCat);
	    animalList.add(parrwithRooster);
	    animalList.add(rooster);
	    animalList.add(shark);
   }
   
   public long countNoofAnimalsCanFly(){	
	   return animalList.stream()
               .filter(animalList -> animalList.isCanFly())
               .count();
   }
   
   public long countNoofAnimalsCanSwim(){
	   return animalList.stream()
               .filter(animalList -> animalList.isCanSwim())
               .count();
   }
   
   public long countNoofAnimalsCanSing(){
	   return animalList.stream()
               .filter(animalList -> animalList.isCanSing())
               .count();
   }
   
   public long countNoofAnimalsCanWalk(){
	   return animalList.stream()
               .filter(animalList -> animalList.isCanWalk())
               .count();
   }
   
   public static void main(String[] args){
	   CountingAnimals countingAnimals=new CountingAnimals();
	   System.out.println("No of animals can fly --->"+countingAnimals.countNoofAnimalsCanFly());
	   System.out.println("No of animals can Swim --->"+countingAnimals.countNoofAnimalsCanSwim());
	   System.out.println("No of animals can Sing --->"+countingAnimals.countNoofAnimalsCanSing());
	   System.out.println("No of animals can Walk --->"+countingAnimals.countNoofAnimalsCanWalk());
   }
}
