package com.techlabs.set;

public class TestSet {
	public static void main(String[] args) {
		Tree tree = new Tree();
		Hash hash = new Hash();
		LinkedHashed link = new LinkedHashed();
		
		tree.treeSetAdd(12);
		tree.treeSetAdd(9);
		tree.treeSetAdd(34);
		tree.treeSetAdd(11);
		tree.treeDisplay();
		tree.removeElement(34);
		tree.treeDisplay();
		
		hash.HashSetAdd(10);
		hash.HashSetAdd(34);
		hash.HashSetAdd(78);
		hash.HashSetAdd(98);
		hash.HashDisplay();
		hash.removeElement(10);
		hash.HashDisplay();
		hash.searchElement(98);
		
		link.linkedHashSetAdd(20);
		link.linkedHashSetAdd(40);
		link.linkedHashSetAdd(30);
		link.linkedHashSetAdd(70);
		link.linkedHashDisplay();
		link.removeElement(20);
		link.linkedHashDisplay();
	}
}
