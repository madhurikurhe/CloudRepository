package com.techlabs.mutable;

public class TestMutable {

	public static void main(String[] args) {
		int marks = 100;
		mutableMarks(marks);

		System.out.println("Marks:" + marks);
	}

	private static void mutableMarks(int marks) {
		marks = 0;
	}
}
