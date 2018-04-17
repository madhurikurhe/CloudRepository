package com.techlabs.college;


public class Professor extends Person {
	private int noOfHoursWorked;
	int salary;
	public Professor(int id, String address, String dateOfBirth,int hours) {
		super(id, address, dateOfBirth);
		this.noOfHoursWorked=hours;
	}

	

	public int getSalary() {
		return salary;
	}



	public void setNoOfHoursWorked(int noOfHoursWorked) {
		this.noOfHoursWorked = noOfHoursWorked;
	}



	public int getNoOfHoursWorked() {
		return noOfHoursWorked;
	}

	

	
}
