package com.techlabs.ricks.guitar;

import java.util.Comparator;

public class SortByModelComparator implements Comparator<Guitar> {
	@Override
	public int compare(Guitar arg0, Guitar arg1) {
		return (arg0.getSpec().getModel().length() - arg1.getSpec().getModel()
				.length());
	}

}
