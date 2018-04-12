package com.techlabs.ricks.guitar;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List inventory;

	public Inventory() {
		inventory = new LinkedList();
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument=null;
		if(spec instanceof GuitarSpec){
			instrument=new Guitar(serialNumber, price, (GuitarSpec) spec);
			
		}else if(spec instanceof MandolinSpec){
			instrument=new Mandolin(serialNumber, price, (MandolinSpec) spec);
			
		}
		inventory.add(instrument);

	}

	public Instrument get(String serialNumber) {
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;

	}

	public List search(GuitarSpec searchspec) {
		List matchingGuitars = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument guitar = (Instrument) i.next();
			if (Instrument.getSpec().matches(searchspec))
				matchingGuitars.add(guitar);
		}

		return matchingGuitars;
	}
	 
	public List search(MandolinSpec searchspec) {
		List matchingMandolins = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Mandolin mandolin = (Mandolin) i.next();
			if (mandolin.getSpec().matches(searchspec))
				matchingMandolins.add(mandolin);
		}

		return matchingMandolins;
	}
	 	
/*
	public void display() {
		Collections.sort(inventory, new SortByModelComparator() {
		});

		Collections.reverse(inventory);

		System.out.println("\nTotal Number of guitars in Ricks Inventory:"
				+ inventory.size());
		System.out.println("Guiatrs in reverse order:");
		System.out.println("\nSerial number\t\t Price\t\t\tModel");
		for (Guitar g : inventory) {
			System.out.print("\n" + g.getSerialNumber());
			System.out.print("\t\t\t" + g.getPrice());
			System.out.print("\t\t\t" + g.getSpec().getModel());

		}

	}
*/
}
