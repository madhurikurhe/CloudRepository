package com.techlabs.dog.door;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door=new DogDoor();
		BarkRecognizer recognizer=new BarkRecognizer(door);
		System.out.println("Fido starts barking");
		recognizer.recognize("Woof");
		
		System.out.println("Fido has gone outside");
		
		System.out.println("Fido's all done");
		try{
			Thread.currentThread();
			Thread.sleep(10000);
		}catch(InterruptedException e){}
		System.out.println("...But he is stuck outside!");
		System.out.println("Fido starts barking");
		recognizer.recognize("Woof");
		System.out.println("Fido's back inside");
	}
}
