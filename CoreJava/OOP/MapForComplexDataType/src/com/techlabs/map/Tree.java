package com.techlabs.map;

import java.util.TreeMap;

public class Tree {
	TreeMap<Dog, Integer> treeMap = new TreeMap<Dog, Integer>();

	public void addToTreeMap(Dog d1, int i) {

		treeMap.put(d1, i);

	}

	public void display() {
		System.out.println("Size of TreeMap:" + treeMap.size());
		treeMap.forEach((key, value) -> System.out.println(key + " : " + value));
	}
	
	public void remove(){
		Dog key = new Dog("red", 60);
		if(treeMap.remove(key) != null)
			System.out.println("Element removed from hashMap");
		else
			System.out.println("Element not Found");
	}

}
