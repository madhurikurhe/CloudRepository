package com.techlabs.RTO;

import java.util.TreeSet;

public class TestRTO {
	public static void main(String[] args) {
		TreeSet<RTO> tree = new TreeSet<RTO>();
		tree.add(new RTO("Assam", 04));
		tree.add(new RTO("Kerala", 02));
		tree.add(new RTO("Jammu", 01));
		tree.add(new RTO("Gujrat", 03));
		tree.add(new RTO("HP",  8));
		tree.add(new RTO("MP", 06));
		

		System.out.println("Total RTO codes:" + tree.size());
		Search search = new Search(tree);
		Display display = new Display(tree);
		display.displayAll();
		RTO node = search.findNode("Gujrat");
		System.out.println("\n\nState:" +node.getState() +"   Code:" +node.getCode());
	}
}

