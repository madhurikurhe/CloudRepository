package com.techlabs.college;

public class Student extends Person {
	private Branch branch;
	public Student(int id, String address, String dateOfBirth,Branch branch) {
		super(id, address, dateOfBirth);
		this.setBranch(branch);
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	

}
