package com.techlabs.reflection;

public class ReflectionTest {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException {
		Reflection r1 = new Reflection();
		Reflection.getnoOfMethods();
		//System.out.println("No of Methods:" + r1.getnoOfMethods());
		System.out.println("No of getter and setter:" + Reflection.noOfGettersOf());
		Reflection.getnoOfConstructors();
		//System.out.println("No of Constructors:" + r1.getnoOfConstructors());
	}
}
