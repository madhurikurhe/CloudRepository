package com.techlabs.operations;

public class ArithmaticOperations {

	public static void main(String[] args) {
		int firstNumber = 6;
		int secondNumber = 6;
		addition(firstNumber, secondNumber);
		addition(2, 3);

		subtraction(8, 4);
		subtraction(8, 7);

	}

	public static void addition(int firstNo, int secondNo) {
		int result = firstNo + secondNo;
		System.out.println("Addition is:" + result);
	}

	public static void subtraction(int firstNo, int secondNo) {

		int result = firstNo - secondNo;
		System.out.println("Subtraction is:" + result);
	}
}
