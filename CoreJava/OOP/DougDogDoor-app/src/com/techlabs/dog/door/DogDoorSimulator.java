package com.techlabs.dog.door;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		System.out.println("Fido Barks to go outside");
		remote.pressButton();
		System.out.println("Fido has gone outside");
		
		System.out.println("Fido's all done");
		System.out.println("Fido's back inside");
	}
}
