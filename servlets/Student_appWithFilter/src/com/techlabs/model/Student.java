package com.techlabs.model;

public class Student {
	private String firstName, lastName;
	private double cgpa;
	private int roll_no;
	private String collegeId;
	


	public Student(int roll_no, String firstName, String lastName, double cgpa, String collegeId){
		this.setRoll_no(roll_no);
		this.firstName = firstName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.collegeId = collegeId;
	}


	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}


	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no2) {
		this.roll_no = roll_no2;
	}
}
