package com.techlabs.college;

import java.util.List;

public class Professor extends Person implements SalariedEmployee{
	private int noOfHoursWorked;
	private int salary;
	public Professor(int id, String address, String dateOfBirth,int hours) {
		super(id, address, dateOfBirth);
		this.noOfHoursWorked=hours;
	}


	public int getNoOfHoursWorked() {
		return noOfHoursWorked;
	}

	@Override
	public List<Professor> calculateSalary(List<Professor> professor) {
		for(Professor p:professor){
		p.salary=100* p.getNoOfHoursWorked();
		}
		return professor;
	}

	
}
