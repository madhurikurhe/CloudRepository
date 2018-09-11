package com.techlabs.student.model;

public class Student {

	private String id;
	private String name;

	public Student(String id, String name) {
		super();
		this.setId(id);
		this.setName(name);
	}

	public Student(String id){
		this.setId(id);
	}
	public Student(){
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
