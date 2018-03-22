package com.techlabs.bmi;

public class PersonTest {
	public static void main(String args[]) {
		Person p1 = new Person("Madhuri", 1.6, 65, 28, Gender.FEMALE);
		printdetails(p1);
		System.out.println("\nBMI before excercise");
		System.out.println("Body structure:" +p1.getBodyStructure());
		p1.workout(60);
		System.out.println("\nBMI after excercise");
		System.out.println("Body structure:" +p1.getBodyStructure());
		System.out.println("\nBMI before meal");
		System.out.println("Body structure:" +p1.getBodyStructure());
		p1.eat(3);
		System.out.println("\nBMI after meal");
		System.out.println("Body structure:" +p1.getBodyStructure());

	}

	private static void printdetails(Person p1) {
	System .out.println("Use Name" +p1.toString());
		
	}

}
