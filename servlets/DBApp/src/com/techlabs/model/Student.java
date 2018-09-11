package com.techlabs.model;

public class Student {

	private String id;
	private String name;

	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {

	}

	public String getId() {
		return id;
	}

	public void setId(String string) {
		this.id = string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
