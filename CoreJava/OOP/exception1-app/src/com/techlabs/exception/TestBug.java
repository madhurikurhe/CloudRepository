package com.techlabs.exception;

public class TestBug {

	public static void main(String[] args) throws Exception {

		int c = 0;
		String s1 = args[0];
		String s2 = args[1];

		System.out.println(args.length);

		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		c = a / b;

		System.out.println(c);

		main(args);

	}
}