package com.techlabs.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashed {
	LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();

	public void linkedHashSetAdd(int number) {
		linkedHashSet.add(number);
	}

	public void linkedHashDisplay() {
		Iterator<Integer> iterator = linkedHashSet.iterator();
		System.out.print("\nLinked Hash set data: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	public void removeElement(int element) {
		if (!linkedHashSet.isEmpty()) {
			if (linkedHashSet.remove(element)) {
				System.out.println("\n" + element
						+ " Removed from Linked Hash Set");
			} else {
				System.out.println("Element not found");
			}

		} else
			System.out.println("Linked Hash  set is empty");

	}

	public void searchElement(int element) {
		if (linkedHashSet.contains(element)) {
			System.out.println("\nElement" + element + "Found");
		} else
			System.out.println("Element not found");
	}
}
