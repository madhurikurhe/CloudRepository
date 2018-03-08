package com.techlabs.evennotest;

public class TestEvenNos {

	public static void main(String[] args) {

		printEven(100, 150);
		printEven(10);

	}

	private static void printEven(int upperLimit) {
		int start = 0;
		System.out.println("Even numbers are:");

		while (start != upperLimit) {
			if (isEven(start)) {
				System.out.print(" " + start);

			}
			start++;

		}
	}

	private static void printEven(int lowerLimit, int upperLimit) {

		int start = lowerLimit;
		System.out.println("Even numbers are:");
		while (start != upperLimit) {
			if (isEven(start)) {
				System.out.print(" " + start);

			}
			start++;
		}
	}

	private static boolean isEven(int start) {
		if (start % 2 == 0)
			return true;
		else
			return false;

	}

}
