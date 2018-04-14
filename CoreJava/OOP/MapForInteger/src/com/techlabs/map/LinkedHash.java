package com.techlabs.map;

import java.util.LinkedHashMap;

public class LinkedHash {
	LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

	public void linkInsert() {
		map.put(1, "one");
		map.put(3, "eight");
		map.put(2, "two");
		map.put(5, "four");
		map.put(7, "three");

	}

	public void display() {
		System.out.print("\nLinkedHash Map:");
		for (int k : map.keySet()) {
			System.out.print(k + ", ");
		}

	}

	public void remove() {
		if (map.remove(1) != null)
			System.out.println("\nElement removed from LinkedHashSet");
		else
			System.out.println("\nElement not found");
	}

	public void search() {
		int element=0;
		if(map.containsKey(element))
			System.out.println("\nElement found:" +map.get(element));
		else
			System.out.println("\nElement not found");

	}

	public void update(){
		int key = 5;
		if (map.containsKey(key)) {
			if(map.replace(key, "four", "six"))
			System.out.println("\nRecord updated");
			else
				System.out.println("Record not updated");
		}
		else
			System.out.println("Key not found");

	}

	
}
