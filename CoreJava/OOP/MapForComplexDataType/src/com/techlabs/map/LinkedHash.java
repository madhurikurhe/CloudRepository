package com.techlabs.map;

import java.util.LinkedHashMap;

public class LinkedHash {
	LinkedHashMap<Dog, Integer> linkedHashMap = new LinkedHashMap<Dog, Integer>();

	public void addToLinkedHashMap(Dog d1, int i) {

		linkedHashMap.put(d1, i);
	}

	public void display() {
		System.out.println("Size of LinkedHashMap:"+linkedHashMap.size());
		linkedHashMap.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}
