package com.techlabs.custom.exception;

public class AddStudent {
	public static void main(String args[]) throws StudentNotFoundException {
		try {
			find("1234");
		} catch (StudentNotFoundException ex) {
			System.err.print(ex);
		}
	}

	private static Boolean find(String studentID)
			throws StudentNotFoundException {
		if (studentID.equals("12345"))
			return true;
		else
			throw new StudentNotFoundException("Student not found" + studentID);
	}
}
