package com.techlabs.compositeDemo;

public class Manager implements Employee {

	private int empID;
	private String name;

	public Manager(int id, String name) {
		this.empID = id;
		this.name = name;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(empID + " " + name);
	}

}
