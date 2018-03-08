package com.techlabs.basic;

public class TestOverload {
	public static void main(String[] args) {
		print(100);
		print(130.15);
		print(0.2f);
		print("Hello");
		print(true);
		print('c');
	}
	private static void print(char printcharacter) {
		// TODO Auto-generated method stub
		System.out.println("Calling overloaded method to print character");
		System.out.println("character is: " + printcharacter);

	}
	
	private static void print(boolean booleanValue) {
		// TODO Auto-generated method stub
		System.out.println("Calling overloaded method to print boolean");
		System.out.println("Boolean Value is: " + booleanValue);
	}

	private static void print(String PrintString) {
		// TODO Auto-generated method stub
		System.out.println("Calling overloaded method to print string");
		System.out.println("String is: " + PrintString);
	}

	private static void print(double doubleNumber) {
		// TODO Auto-generated method stub
		System.out.println("Calling overloaded method to print double");
		System.out.println("Double number is: " + doubleNumber);
	}

	private static void print(int integerNumber) {
		// TODO Auto-generated method stub
		System.out.println("Calling overloaded method to print integer");
		System.out.println("Integer Number is: " + integerNumber);

	}
	
	private static void print(float floatNumber) {
		// TODO Auto-generated method stub
		System.out.println("Calling overloaded method to print float");
		System.out.println("float Number is: " + floatNumber);

	}
	
}
