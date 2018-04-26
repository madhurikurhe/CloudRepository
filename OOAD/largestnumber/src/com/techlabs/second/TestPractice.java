package com.techlabs.second;

public class TestPractice {

	public static void main(String[] args) {
		int[] printValue = { 1, 2, 7, 10, 8, 3, 4, 5 };
		maxTwoNumber(printValue);

	}

	static void maxTwoNumber(int[] printValue) {
		int largestValue = printValue[0];
		int secondValue = printValue[0];

		for (int n : printValue) {
			if (largestValue < n) {
				secondValue = largestValue;
				largestValue = n;

			}else if(n>secondValue){
				secondValue=n;
			}
		}
		System.out.println("highest value = " + largestValue);
		System.out.println("Second highest value = " + secondValue);
		

	}

}
