package com.techlabs.map;

import java.util.TreeMap;

public class Tree {
	TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();

	public void treeInsert() {

		tree1.put(1, "one");
		tree1.put(3, "eight");
		tree1.put(2, "two");
		tree1.put(5, "four");
		tree1.put(7, "three");

	}

	public void display() {
		System.out.print("\nTree Map:");
		for (int k : tree1.keySet()) {
			System.out.print(k + ", ");
		}

	}

	public void remove() {
		int element = 3;
		if (tree1.remove(element) != null)
			System.out.print("\nElement Removed from TreeMap:");
		else
			System.out.print("\nElement not found");
	}

	public void search() {
		int element = 5;
		if (tree1.containsKey(element))
			System.out.println("\nElement found:" + tree1.get(element));
		else
			System.out.println("\nElement not found");

	}
	
	public void update(){
		int key = 5;
		if (tree1.containsKey(key)) {
			if(tree1.replace(key, "four", "six"))
			System.out.println("\nRecord updated");
			else
				System.out.println("Record not updated");
		}
		else
			System.out.println("Key not found");

	}

	}

