package com.techlabs.dog.door;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println(" BarkRecognizer: Heard a '" + bark.getSound() + "'");
		List<Bark> allowedBarks = door.getAllowedBarks();
		for (int i = 0; i < allowedBarks.size(); i++){
			if (allowedBarks.get(i).getSound().equals(bark.getSound())) {
				System.out.println(allowedBarks.get(i).getSound());
				System.out.println(bark.getSound());
				door.open();
				return;
			}
		}
		System.out.println("This Dog is not allowed");

	}
}
