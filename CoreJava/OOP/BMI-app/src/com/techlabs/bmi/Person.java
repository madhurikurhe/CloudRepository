package com.techlabs.bmi;

public class Person {

	private String name;
	private double height;
	private int weight;
	private int age;
	private Gender gender;

	public Person(String name, double height, int weight, int age, Gender gender) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
	}

	public void eat(int meal) {
		if (meal > 2)
			this.weight = this.weight + 1;
		else
			this.weight = weight;
	}

	public double calculateBMI() {
		double BMI = 0;
		BMI = (this.weight) / (this.height * this.height);
		bodyStructure(BMI);
		return BMI;
	}

	public void bodyStructure(double BMI) {
		System.out.println("BMI is:" +BMI);
		if (BMI < 18.5)
			System.out.println("You are Underweight");
		else if (BMI > 18.5 & BMI < 25)
			System.out.println("You are Normal");
		else if (BMI > 25 & BMI < 30)
			System.out.println("You are overweight");
		else
			System.out.println("You are obese");

	}

	public void workout(int time) {
		if (time > 45)
			this.weight = this.weight - 1;
		else
			this.weight = weight;
	}

}