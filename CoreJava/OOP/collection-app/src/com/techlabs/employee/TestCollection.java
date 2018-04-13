package com.techlabs.employee;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
	public static void main(String[] args) {
		List items = new ArrayList();
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
