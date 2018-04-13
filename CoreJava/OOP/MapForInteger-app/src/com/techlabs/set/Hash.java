package com.techlabs.set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {
	HashSet<Integer> hash1 = new HashSet<Integer>();
	public void HashSetAdd(int number) {
		hash1.add(number);
	}

	public void HashDisplay() {
		System.out.print("\nHash set data: ");
		Iterator<Integer> iterator = hash1.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	public void removeElement(int element) {
		if (!hash1.isEmpty()) {
			if (hash1.remove(element)) {
				System.out.println("\n" + element + " Removed from hashset");
			} else {
				System.out.println("Element not found");
			}

		} else
			System.out.println("Hash set is empty");

	}
	
	public void searchElement(int element){
		if(hash1.contains(element)){
			System.out.println("\nElement" +element +"Found");
		}
		else
			System.out.println("Element not found");
	}

}
