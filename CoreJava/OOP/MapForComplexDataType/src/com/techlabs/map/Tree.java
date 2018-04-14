package com.techlabs.map;

import java.util.TreeMap;

public class Tree {
	TreeMap<Dog, Integer> treeMap = new TreeMap<Dog, Integer>();

	public void addToTreeMap(Dog d1, int i) {

		treeMap.put(d1, i);

	}

	public void display() {
		System.out.println("Size of TreeMap:"+treeMap.size());
		treeMap.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}
