package com.techlabs.set;

public class TestSet {
	public static void main(String[] args) {
		Tree tree = new Tree();
		Hash hash = new Hash();
		LinkedHashed link = new LinkedHashed();
		
		//caseStudyTree(tree);
			
	//	caseStudyHashSet(hash);
		
	caseStudyLinkedHashSet(link);
	
	}

	private static void caseStudyHashSet(Hash hash) {
		hash.HashSetAdd(new Employee(101,"Madhu"));
		hash.HashSetAdd(new Employee(106,"Rupa"));
		hash.HashSetAdd(new Employee(103,"Prasad"));
		hash.HashSetAdd(new Employee(102,"Trisha"));
		hash.HashDisplay();
		Employee emp=new Employee(101,"Madhu");
		hash.removeElement(emp);
		hash.HashDisplay();
	    Employee emp1=new Employee(106,"Rupa");
		hash.searchElement(emp1);
	}

	private static void caseStudyLinkedHashSet(LinkedHashed link) {
		link.linkedHashSetAdd(new Employee(101,"Madhu"));
		link.linkedHashSetAdd(new Employee(107,"Rupa"));
		link.linkedHashSetAdd(new Employee(105,"Prasad"));
		link.linkedHashSetAdd(new Employee(103,"Trisha"));
		link.linkedHashDisplay();
		Employee emp=new Employee(101,"Madhu");
		link.removeElement(emp);
		link.linkedHashDisplay();
		Employee emp1=new Employee(107,"Rupa");
		int id1=emp1.getId();
		System.out.println(id1);
		link.searchElement(id1);
	}

	private static void caseStudyTree(Tree tree) {
		tree.treeSetAdd(new Employee(101,"Madhu"));
		tree.treeSetAdd(new Employee(108,"Rupa"));
		tree.treeSetAdd(new Employee(107,"Prasad"));
		tree.treeSetAdd(new Employee(103,"Trisha"));
		tree.treeDisplay();
		Employee emp=new Employee(101,"Madhu");
		tree.removeElement(emp);
		tree.treeDisplay();
	    Employee emp1=new Employee(106,"Rupa");
		tree.searchElement(emp1);
	}
}
