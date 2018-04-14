package com.techlabs.map;

import java.util.LinkedHashMap;

public class LinkedHash {
	LinkedHashMap<Dog, Integer> linkedHashMap = new LinkedHashMap<Dog, Integer>();

	public void addToLinkedHashMap(Dog d1, int i) {

		linkedHashMap.put(d1, i);
	}

	public void display() {
		System.out.println("Size of LinkedHashMap:" + linkedHashMap.size());
		linkedHashMap.forEach((key, value) -> System.out.println(key + " : "
				+ value));
	}

	public void remove() {
		Dog key = new Dog("red", 60);
		if (linkedHashMap.remove(key) != null)
			System.out.println("Element removed from hashMap");
		else
			System.out.println("Element not Found");
	}

}
