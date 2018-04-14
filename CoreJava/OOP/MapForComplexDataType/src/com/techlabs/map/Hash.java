package com.techlabs.map;

import java.util.HashMap;

public class Hash {
	HashMap<Dog, Integer> hashMap = new HashMap<Dog, Integer>();

	public void addToHashMap(Dog d1, int i) {
		hashMap.put(d1, i);
	}

	public void display() {
		System.out.println("Size of HashMap:"+hashMap.size());
		hashMap.forEach((key, value) -> System.out.println(key + " : " + value));
	}

	public void remove(){
		Dog key = new Dog("red", 20);
		if(hashMap.remove(key) != null)
			System.out.println("Element removed from hashMap");
		else
			System.out.println("Element not Found");
	}
}
