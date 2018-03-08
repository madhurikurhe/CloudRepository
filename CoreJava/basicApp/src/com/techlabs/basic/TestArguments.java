package com.techlabs.basic;

public class TestArguments {

	public static void main(String[] names) {
		int count = names.length;
		System.out.println("No of arguments:" + count);
		
		if (count == 0) {
			System.out.println("Pass Arguments");
		}
		
		for (String name : names) {
			System.out.println("Hello " + name);
			

		}

	}
}