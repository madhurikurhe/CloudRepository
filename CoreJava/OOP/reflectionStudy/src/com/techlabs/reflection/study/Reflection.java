package com.techlabs.reflection.study;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {
	Class class1 = String.class;

	public Method[] getnoOfMethods() {
		Method[] methods = class1.getDeclaredMethods();
		return methods;

	}

	public Constructor[] getnoOfConstructors() throws Exception {
		Constructor[] ct = class1.getDeclaredConstructors();
		return ct;

	}

 int noOfGettersOf() {
		int noOfGetters = 0;
		Method[] methods = class1.getDeclaredMethods();
		for (Method method : methods) {
			String methodName = method.getName();
			if (methodName.startsWith("get") || methodName.startsWith("set")) {
				noOfGetters++;
			}
		}
		return noOfGetters;
	}

}
