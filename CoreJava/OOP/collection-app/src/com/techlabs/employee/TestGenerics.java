package com.techlabs.employee;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
	public static void main(String[] args) {
		List<Employee> items = new ArrayList<Employee>();
		items.add(new Employee(5));
		items.add(new Employee(6));
		items.add(new Employee(7));
		items.add(new Employee(8));
		items.add("Hello");

		for (Object item : items) {
			Employee emp = (Employee) item;
			System.out.println(emp.calculateSalary());
		}

	}

}
