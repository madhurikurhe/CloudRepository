package com.techlabs.RTO;

import java.util.TreeSet;

public class Display {
	TreeSet<RTO> tree;

	public Display(TreeSet<RTO> tree) {
		this.tree = tree;
	}
	public void displayAll(){
		System.out.print("\nRTO codes: ");
		for (RTO r : tree) {
			System.out.print("\nState:" + r.getState());
			System.out.print("\t\tCode:" + r.getCode());
		}
	}
}
