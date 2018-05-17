package com.techlabs.compositeDemo;

public class Developer implements Employee {
	private int empID;
	private String name;
	
	public Developer(int id,String name){
		this.empID=id;
		this.name=name;
	}
	
	@Override
	public void showEmployeeDetails() {
		System.out.println(empID +" " +name);
	}

}

