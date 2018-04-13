package com.techlabs.set;

import java.util.TreeSet;

public class Tree {
	TreeSet<Employee> tree = new TreeSet<Employee>();

	public void treeSetAdd(Employee emp) {
		tree.add(emp);
	}

	public void treeDisplay() {
		System.out.print("\nTree set data: ");
		for (Employee e : tree) {
			System.out.print("\nEmployee ID:" + e.getId());
			System.out.print("\t\tEmployee Name:" + e.getName());
		}
	}

	public void removeElement(Employee emp) {
		if (!tree.isEmpty()) {
			if (tree.remove(emp)) {
				System.out.println("\n" + emp.getId() + " Removed from Treeset");
			} else {
				System.out.println("Element not found");
			}

		} else
			System.out.println("Tree set is empty");

	}

	public void searchElement(Employee emp) {
		if (tree.contains(emp)) {
			System.out.println("\nEmployee " + emp.getId() + " Found");
		} else
			System.out.println("Employee not found");
	}
}
