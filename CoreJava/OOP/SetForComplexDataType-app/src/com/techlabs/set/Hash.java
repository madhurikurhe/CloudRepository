package com.techlabs.set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {
	HashSet<Employee> hash1 = new HashSet<Employee>();

	public void HashSetAdd(Employee emp) {
		hash1.add(emp);
	}

	public void HashDisplay() {
		System.out.print("\nHash set data: ");
		for (Employee e : hash1) {
			System.out.print("\nEmployee ID:" + e.getId());
			System.out.print("\t\tEmployee Name:" + e.getName());
		}
	}

	public void removeElement(Employee emp) {
		if (!hash1.isEmpty()) {
			if (hash1.remove(emp)) {
				System.out.println("\n" + emp.getId() + " Removed from hashset");
			} else {
				System.out.println("Element not found");
			}

		} else
			System.out.println("Hash set is empty");

	}

	public void searchElement(Employee emp) {
		if (hash1.contains(emp)) {
			System.out.println("\nEmployee " + emp.getId() + " Found");
		} else
			System.out.println("Employee not found");
	}

}
