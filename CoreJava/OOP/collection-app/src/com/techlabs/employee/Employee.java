package com.techlabs.employee;

public class Employee {
	private static int noOfHours;
	private static int salary;

	public Employee(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public static int calculateSalary() {
		salary = noOfHours * 1000;
		return salary;
	}

}
