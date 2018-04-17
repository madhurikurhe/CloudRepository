package com.techlabs.RTO;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Search {
	Set<RTO> set = new TreeSet<RTO>();
	
	public Search(TreeSet<RTO> tree){
		this.set=tree;
	}

	public RTO findNode(String state) {
		Iterator<RTO> iterator = set.iterator();
		while (iterator.hasNext()) {
			RTO node = iterator.next();
			if (node.getState() == state)
				return node;
		}

		return null;
	}
}
