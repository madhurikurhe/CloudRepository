package com.techlabs.ricks.guitar;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, Builder fender,
			String model, Type electric, Wood alder, Wood alder2, int numStrings) {
		GuitarSpec spec = new GuitarSpec(fender, model, electric, alder2,
				alder2, numStrings);
		Guitar guitar = new Guitar(serialNumber, price, numStrings);
		guitar.setSpec(spec);
		guitars.add(guitar);

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

	public void display() {
		Collections.sort(guitars, new SortByModelComparator() {
		});
		
		Collections.reverse(guitars);

		System.out.println("\nTotal Number of guitars in Ricks Inventory:" + guitars.size());
		System.out.println("Guiatrs in reverse order:");
		System.out.println("\nSerial number\t\t Price\t\t\tModel");
		for (Guitar g : guitars) {
			System.out.print("\n" +g.getSerialNumber());
			System.out.print( "\t\t\t"+g.getPrice());
			System.out.print( "\t\t\t"+g.getSpec().getModel());
			//System.out.print("\tBackwood:" + g.getSpec().getBackwood());
			//System.out.print("\tTopwood:" + g.getSpec().getTopwood());
			//System.out.print("\tType:" + g.getSpec().getType());
			//System.out.print("\tNumofStrings:" + g.getSpec().getNumStrings());
			//System.out.print("\tBuilder:" + g.getSpec().getBuilder());

		}

	}
}
