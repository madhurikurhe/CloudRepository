package com.techlabs.map;

public class TestMap {
	public static void main(String[] args) {
		Tree tree = new Tree();
		Hash hash = new Hash();
		LinkedHash link = new LinkedHash();

		caseStudyTree(tree);

		caseStudyHash(hash);

		caseStudyLink(link);

	}

	private static void caseStudyHash(Hash hash) {
		hash.hashInsert();
		hash.display();
		hash.removeElement();
		hash.display();
		hash.search();
		hash.update();
		hash.display();
	}

	private static void caseStudyLink(LinkedHash link) {
		link.linkInsert();
		link.display();
		link.remove();
		link.display();
		link.search();
		link.update();
		link.display();
	}

	private static void caseStudyTree(Tree tree) {
		tree.treeInsert();
		tree.display();
		tree.remove();
		tree.display();
		tree.search();
		tree.update();
		tree.display();
	}

}
