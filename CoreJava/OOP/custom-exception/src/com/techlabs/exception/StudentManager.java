package com.techlabs.exception;

public class StudentManager {

	public Student find(String studentID) throws StudentNotFoundException {
		if (studentID.equals("12345")) {
			System.out.println("Student Found");
			return new Student();
		} else {
			throw new StudentNotFoundException("Student ID not found");
		}

	}
}
