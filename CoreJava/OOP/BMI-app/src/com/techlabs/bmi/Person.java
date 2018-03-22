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
			this.weight = weight;
	}

	public double calculateBMI() {
	 return  (this.weight) / (this.height * this.height);
	
	}

	public String getBodyStructure() {

		double BMI = calculateBMI();
		if (BMI < 18.5)
			return "underweight";

		if (BMI > 18.5 & BMI < 25)
			return "normal";

		if (BMI > 25 & BMI < 30)
			return "overweight";

		return "obese";

	}

	public void workout(int time) {
		if (time > 45)
			this.weight = this.weight - 1;
			this.weight = weight;
	}

}