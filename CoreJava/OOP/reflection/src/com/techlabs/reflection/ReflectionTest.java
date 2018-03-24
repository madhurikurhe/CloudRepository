package com.techlabs.reflection;

public class ReflectionTest {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException {
		Reflection r1 = new Reflection();
		r1.getnoOfMethods();
		//System.out.println("No of Methods:" + r1.getnoOfMethods());
		System.out.println("No of getter and setter:" + r1.getnoOfGetSet());
		r1.getnoOfConstructors();
		//System.out.println("No of Constructors:" + r1.getnoOfConstructors());
	}
}
