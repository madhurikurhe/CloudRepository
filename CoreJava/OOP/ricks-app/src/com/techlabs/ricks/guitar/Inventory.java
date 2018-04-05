package com.techlabs.ricks.guitar;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public List<Guitar> addGuitar(String serialNumber, double price,
			Builder fender, String model, Type electric, Wood alder,
			Wood alder2, int numStrings) {
		GuitarSpec spec = new GuitarSpec(fender, model, electric, alder2,
				alder2, numStrings);
		Guitar guitar = new Guitar(serialNumber, price, numStrings);
		guitar.setSpec(spec);
		guitars.add(guitar);
		return guitars;
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;

	}

	public List<Guitar> search(GuitarSpec searchspec) {
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSpec().matches(searchspec))
				matchingGuitars.add(guitar);
		}

		return matchingGuitars;
	}


}
