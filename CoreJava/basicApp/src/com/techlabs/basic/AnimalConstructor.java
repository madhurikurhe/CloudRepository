package com.techlabs.basic;

public class AnimalConstructor {
	public static void main(String[] args) {
		System.out.println("Starting..");
		Hippo h = new Hippo();
	}
}

class Hippo extends Animal {
	public Hippo() {
		System.out.println("Making a Hippo");
	}
}

class Animal {
	public Animal() {
		System.out.println("Making a Animal");
	}
}