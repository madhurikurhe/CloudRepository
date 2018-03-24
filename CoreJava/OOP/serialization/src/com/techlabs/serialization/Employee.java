package com.techlabs.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	transient private int age;

	public String toString() {
		return "\nAge=" + age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
