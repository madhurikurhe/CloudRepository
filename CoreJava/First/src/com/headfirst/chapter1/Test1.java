package com.headfirst.chapter1;

public class Test1 {
	public static void main(String[] args) {
		int x = 6;
		while (x < 12) {
			x = x + 1;
			System.out.print("\nx is " + x);
		}
		for (int i = 0; i < 10; i = i + 1) {
			System.out.print("\nx is " + i);
		}
	}
}
