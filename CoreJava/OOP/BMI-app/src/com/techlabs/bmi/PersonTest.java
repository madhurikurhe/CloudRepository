package com.techlabs.bmi;

public class PersonTest {
	public static void main(String args[]) {
		Person p1 = new Person("Madhuri", 1.6, 65, 28, Gender.FEMALE);
		printdetails(p1);

	}

	private static void printdetails(Person p1) {
		System.out.println("User Name:" + p1.getName());
		System.out.println("Height is:" + p1.getHeight());
		System.out.println("Weight is:" + p1.getWeight());
		System.out.println("Age is:" + p1.getAge());
		System.out.println("Gender:" + p1.getGender());
		System.out.println("\nBMI before excercise");
		System.out.println("Body structure:" + p1.getBodyStructure());
		p1.workout(60);
		System.out.println("\nBMI after excercise");
		System.out.println("Body structure:" + p1.getBodyStructure());
		System.out.println("\nBMI before meal");
		System.out.println("Body structure:" + p1.getBodyStructure());
		p1.eat(3);
		System.out.println("\nBMI after meal");
		System.out.println("Body structure:" + p1.getBodyStructure());

	}

}
