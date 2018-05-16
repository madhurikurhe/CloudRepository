package com.techlabs.CSV.read;

import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

public class Parser {
	private ILoader loader;
	Employee employee = new Employee();

	public Parser(ILoader loader) {
		this.loader = loader;
	}

	public TreeSet<Employee> getRecords() throws IOException {
		List<String> emp = loader.load();
		//System.out.println(emp.size());
		TreeSet<Employee> employees = new TreeSet<Employee>();
		for (String s : emp) {

			String[] attributes = s.split(",");
			int id = Integer.parseInt(attributes[0]);
			int salary = Integer.parseInt(attributes[5]);
			int deptNo = Integer.parseInt(attributes[7]);

			employee.setDesignation(attributes[2]);
			employee.setDeptNo(deptNo);
			employee.setSalary(salary);
			employee.setId(id);
			employee.setName(attributes[1]);

			Employee emp1 = new Employee(salary, employee.getName(),
			employee.getDesignation(), employee.getDeptNo());
			employees.add(emp1);
		}
		System.out.println(employees.size());
		return employees;

	}
}
