package com.techlabs.map;

import java.util.HashMap;

public class Hash {
	HashMap<Integer, String> hash1 = new HashMap<Integer, String>();

	public void hashInsert() {
		hash1.put(1, "one");
		hash1.put(3, "eight");
		hash1.put(2, "two");
		hash1.put(5, "four");
		hash1.put(7, "three");

		}
	

	public void display() {
		System.out.print("\nHash Map:");
		for (int k : hash1.keySet()) {
			System.out.print(k + ", ");
		}

	}

	public void removeElement() {
		int element = 8;
		if (hash1.remove(element) != null)
			System.out.print("\nElement Removed from HashMap");
		else
			System.out.println("\nElement not found");
	}

	public void search() {
		int element = 5;
		if (hash1.containsKey(element))
			System.out.println("\nElement found:" + hash1.get(element));
		else
			System.out.println("\nElement not found");
	}

	public void update() {
		int key = 5;
		if (hash1.containsKey(key)) {
			if(hash1.replace(key, "four", "six"))
			System.out.println("\nRecord updated");
			else
				System.out.println("Record not updated");
		}
		else
			System.out.println("Key not found");

	}

}
