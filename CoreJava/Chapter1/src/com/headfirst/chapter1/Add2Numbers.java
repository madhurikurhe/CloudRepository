package com.headfirst.chapter1;

import java.util.Scanner;

public class Add2Numbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a + b;
		System.out.println("Addition of 2 numbers is: " + c);
	}

}
