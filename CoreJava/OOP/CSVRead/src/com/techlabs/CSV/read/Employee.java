package com.techlabs.CSV.read;

import java.util.ArrayList;
import java.util.List;


public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String designation;
	private int managerId;
	private int DOJ;
	private int salary;
	private int commision;
	private int deptNo;
	private List<Employee> reportees=new ArrayList<Employee>();
	
	public Employee(int id, String name, String designation, int managerId,
			int dOJ, int salary, int commision, int deptNo) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.managerId = managerId;
		DOJ = dOJ;
		this.salary = salary;
		this.commision = commision;
		this.deptNo = deptNo;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int salary2, String name2, String designation, int deptNo,int managerID, int id) {
		this.salary = salary2;
		this.name = name2;
		this.designation = designation;
		this.deptNo = deptNo;
		this.managerId=managerID;
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int mgr) {
		this.managerId = mgr;
	}

	public int getDOJ() {
		return DOJ;
	}

	public void setDOJ(int dOJ) {
		DOJ = dOJ;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

@Override
	public int compareTo(Employee o) {
		return getSalary() - o.getSalary();
		}

public List<Employee> getReportees() {
	return reportees;
}

public void setReportees(List<Employee> reportees) {
	this.reportees = reportees;
}
}
