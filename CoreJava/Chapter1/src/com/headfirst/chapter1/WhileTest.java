package com.headfirst.chapter1;

public class WhileTest {
	public static void main(String[] args) {

		int x = 0;
		while (x < 6) {
			System.out.println("X is:" + x);
			x = x + 1;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println("Using for X is:" + i);
		}
	}

}
