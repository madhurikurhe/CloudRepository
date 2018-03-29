package com.techlabs.object;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WayOfObjectCreation implements Cloneable {
	public WayOfObjectCreation() {

	}

	String name = "newInstance";
	String name1 = "clone";
	String name2 = "newKeyword";
	String name3 = "constructor";

	public static void main(String args[]) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			CloneNotSupportedException, NoSuchMethodException,
			SecurityException, IllegalArgumentException,
			InvocationTargetException {

		WayOfObjectCreation obj1 = new WayOfObjectCreation();
		System.out.println("Object by new keyword:" + obj1.name2);

		WayOfObjectCreation obj = WayOfObjectCreation.class.newInstance();
		System.out.println("Object by new instance:" + obj.name);

		WayOfObjectCreation obj2 = (WayOfObjectCreation) obj.clone();
		System.out.println("Object by clone:" + obj2.name1);

		Constructor<WayOfObjectCreation> constructor = WayOfObjectCreation.class
				.getDeclaredConstructor();
		WayOfObjectCreation r = constructor.newInstance();
		r.setName("objectByConstructor");
		System.out.println("Object by Constructor:" + r.name3);

	}

	private void setName(String string) {
		name3 = string;
	}
}
