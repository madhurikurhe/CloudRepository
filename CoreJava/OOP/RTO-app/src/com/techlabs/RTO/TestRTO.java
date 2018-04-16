package com.techlabs.RTO;

import java.util.TreeSet;

public class TestRTO {
	public static void main(String[] args) {
		TreeSet<RTO> tree = new TreeSet<RTO>();
		tree.add(new RTO("Maharashtra",04));
		tree.add(new RTO("Kerala     ",02));
		tree.add(new RTO("Jammu      ",01));
		tree.add(new RTO("Gujrat     ",03));
		
		System.out.println("Total RTO codes:" +tree.size());
		Search search=new Search("MH",01);
		Display display=new Display(tree);
		display.displayAll();

	}
}
