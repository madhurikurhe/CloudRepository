package com.techlabs.bmi;

public class PersonTest {
	public static void main(String args[]) {
		Person p1 = new Person("Madhuri", 1.6, 65, 28, Gender.FEMALE);
		System.out.println("\nBMI before excercise");
		p1.calculateBMI();
		p1.workout(60);
		System.out.println("\nBMI after excercise");
		p1.calculateBMI();

		System.out.println("\nBMI before meal");
		p1.calculateBMI();
		p1.eat(3);
		System.out.println("\nBMI after meal");
		p1.calculateBMI();

	}

}
