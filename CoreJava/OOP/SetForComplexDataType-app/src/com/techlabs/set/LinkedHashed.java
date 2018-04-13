package com.techlabs.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashed {
	LinkedHashSet<Employee> linkedHashSet = new LinkedHashSet<Employee>();

	public void linkedHashSetAdd(Employee emp) {
		linkedHashSet.add(emp);
	}

	public void linkedHashDisplay() {
		System.out.print("\nLinked Hash set data: ");
		for (Employee e : linkedHashSet) {
			System.out.print("\nEmployee ID:" + e.getId());
			System.out.print("\t\tEmployee Name:" + e.getName());
		}

	}

	public void removeElement(Employee emp) {
		if (!linkedHashSet.isEmpty()) {
			if (linkedHashSet.remove(emp)) {
				System.out.println("\n" + emp.getId()
						+ " Removed from Linked Hash Set");
			} else {
				System.out.println("Element not found");
			}

		} else
			System.out.println("Linked Hash  set is empty");

	}

	public void searchElement(int id) {
		if (linkedHashSet.contains(id)) {
			System.out.println("\nElement" + id + "Found");
		} else
			System.out.println("Element not found");
	}
}
