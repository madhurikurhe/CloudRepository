package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {
	private int methods;
	private int getset;
	private int construct;

	Reflection() {
		
	}

	public Reflection(Double d, Long l) {
		this.d = d;
		this.l = l;
	}

	Double d = new Double(3.9d);
	Long l = new Long(7687);

	public static void main(String aregs[]) throws NoSuchMethodException,SecurityException {
		getnoOfMethods();
		getnoOfConstructors();
		System.out.println("No.of Getters and setter:" +noOfGettersOf());
	
	}

	public static void getnoOfMethods() {
		Reflection r1 = new Reflection();
		Class c = r1.getClass();
		Method[] m = c.getDeclaredMethods();
		System.out.println("Total no of Methods:" + m.length);
		for (int i = 0; i < m.length; i++) {
			System.out.println("method = " + m[i].toString());
		}
	}



	public static void getnoOfConstructors() throws NoSuchMethodException,
			SecurityException {

		Reflection r1 = new Reflection();
		Class c = r1.getClass();
		System.out.println("Myname:"+c);

		Constructor[] ct = c.getDeclaredConstructors();
		for (int i = 0; i < ct.length; i++) {
			System.out.println("Constructor found: " + ct[i].toString());
		}
	}

	public static int noOfGettersOf() {
		int noOfGetters = 0;
		Reflection r1 = new Reflection();
		Class c = r1.getClass();
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			String methodName = method.getName();
			if (methodName.startsWith("get") || methodName.startsWith("set")) {
				noOfGetters++;
			}
		}
		return noOfGetters;
	}

	public static void setName(){
		
	}

	public static void setName1(){
		
	}

}
