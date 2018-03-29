package com.techlabs.iterationTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterationTest {
	public static void main(String args[]) {
		Employees emps=new Employees();
		List<String> names = new LinkedList<>();
		names.add("Madhu");
		names.add("Trisha");
		names.add("Madhu");

		Iterator<String> namesIterator = names.iterator();

		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}

	
		for (Employee emp : emps) {
			System.out.println(emp);

		}

	}
}