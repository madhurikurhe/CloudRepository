package com.techlabs.RTO;

import java.util.TreeSet;

public class Display {
	TreeSet<RTO> tree;

	public Display(TreeSet<RTO> tree) {
		this.tree = tree;
	}
	public void displayAll(){
		System.out.print("RTO codes: ");
		System.out.print("\nState");
		System.out.println("\t\tCode");
		for (RTO r : tree) {
			System.out.print("\n" + r.getState());
			System.out.print("\t\t" + r.getCode());
		}
	}
}
