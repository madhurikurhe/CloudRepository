package com.headfirst.chapter1;

import java.util.Scanner;

public class ConditionalBranching {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter one number:");
		int a = in.nextInt();
		if (a > 5) {
			System.out.println("Number is grater than 5");
		} else {
			System.out.println("Number is less than 5");
		}
	}
}
