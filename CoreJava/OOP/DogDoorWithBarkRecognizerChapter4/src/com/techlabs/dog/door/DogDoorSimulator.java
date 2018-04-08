package com.techlabs.dog.door;


public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door=new DogDoor();
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rooowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("woof"));
		
		BarkRecognizer recognizer=new BarkRecognizer(door);
		System.out.println("Fido starts barking");
		recognizer.recognize(new Bark("rowlf"));
		
		System.out.println("Fido has gone outside");
		
		
		try{
			Thread.currentThread();
			Thread.sleep(10000);
		}catch(InterruptedException e){}
		System.out.println("Fido's all done");
		System.out.println("...But he is stuck outside!");
		Bark smallDogBark=new Bark("yip");
		System.out.println("A small dog starts barking");
		recognizer.recognize(smallDogBark);
		
		try{
			Thread.currentThread();
			Thread.sleep(10000);
		}catch(InterruptedException e){}
		
		System.out.println("Fido starts barking");
		recognizer.recognize(new Bark("rooowlf"));
		System.out.println("Fido's back inside");
	}
}
