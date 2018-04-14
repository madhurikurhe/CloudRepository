package com.techlabs.map;


public class TestMap {
	public static void main(String[] args) {
		Hash hash=new Hash();
		Tree tree=new Tree();
		LinkedHash link=new LinkedHash();
		caseStudyHashMap(hash);
		caseStudyTreeMap(tree);
	
		caseStudyLinkedHashMap(link);
	}

	private static void caseStudyLinkedHashMap(LinkedHash link) {
		link.addToLinkedHashMap(new Dog("red",60),10);
		link.addToLinkedHashMap(new Dog("black",30),12);
		link.addToLinkedHashMap(new Dog("white",40),8);
		link.addToLinkedHashMap(new Dog("white",50),20);
		
		link.display();
	}

	private static void caseStudyTreeMap(Tree tree) {
		tree.addToTreeMap(new Dog("red",60),10);
		tree.addToTreeMap(new Dog("black",30),12);
		tree.addToTreeMap(new Dog("white",40),8);
		tree.addToTreeMap(new Dog("white",50),20);
		
		tree.display();
	}

	private static void caseStudyHashMap(Hash hash) {
		hash.addToHashMap(new Dog("red"),10);
		hash.addToHashMap(new Dog("black"),12);
		hash.addToHashMap(new Dog("white"),8);
		hash.addToHashMap(new Dog("white"),20);
		
		hash.display();
	}

}
