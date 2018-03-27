package com.techlabs.student;

import java.io.Serializable;

public class Student implements Serializable {

	private String firstName;
	private String lastName;
	private String email;

	public Student() {
		firstName = "";
		lastName = "";
		email = "";
	}

	public Student(String fname, String lname, String email) {
		firstName = fname;
		lastName = lname;
		email = email;

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

	public String getemail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Student [FirstName=" + firstName + ", LastName=" + lastName
				+ ", Email=" + email + "]";
	}

}
