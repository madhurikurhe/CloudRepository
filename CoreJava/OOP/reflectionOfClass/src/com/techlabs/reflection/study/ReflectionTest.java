package com.techlabs.reflection.study;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String aregs[]) throws Exception {
		Reflection r1 = new Reflection(String.class);

		Method[] m = r1.getnoOfMethods();
		System.out.println("Total no of Methods:" + m.length);
		for (Method method : m) {
			System.out.println(method.getName());
		}

		Constructor[] ct = r1.getnoOfConstructors();
		System.out.println("Total no of Constructors:" + ct.length);
		for (int i = 0; i < ct.length; i++) {
			System.out.println("Constructor found: " + ct[i].toString());
		}

		System.out.println("No.of Getters and setter:" + r1.noOfGettersOf());

	}

}
