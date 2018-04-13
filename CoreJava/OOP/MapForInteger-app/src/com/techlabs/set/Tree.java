package com.techlabs.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
	TreeSet<Integer> tree = new TreeSet<Integer>();

	public void treeSetAdd(int number) {
		tree.add(number);
	}

	public void treeDisplay() {
		Iterator<Integer> iterator = tree.iterator();
		System.out.print("Tree set data: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	public void removeElement(int element) {
		if (!tree.isEmpty()) {
			if (tree.remove(element)) {
				System.out.println("\n" + element + " Removed from Treeset");
			} else {
				System.out.println("Element not found");
			}

		} else
			System.out.println("Tree set is empty");

	}
	
	public void searchElement(int element){
		if(tree.contains(element)){
			System.out.println("\nElement" +element +"Found");
		}
		else
			System.out.println("Element not found");
	}
}
