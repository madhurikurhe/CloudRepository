package com.techlabs.exception;

public class Student {
	public static void main(String[] args) throws StudentNotFoundException {
		StudentManager manager = new StudentManager();
		
			manager.find("123456");
		
	}
}
