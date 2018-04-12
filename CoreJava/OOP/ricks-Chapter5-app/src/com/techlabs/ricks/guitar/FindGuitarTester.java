package com.techlabs.ricks.guitar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		// inventory.display();

		GuitarSpec whatMadhuLikes = new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 17);
		MandolinSpec whtTrishaLikes=new MandolinSpec(Builder.COLLINGS, "Mandolin", Type.ACOUSTIC, Style.A,
			Wood.ALDER, Wood.CEDAR);
		List matchingGuitars = inventory.search(whatMadhuLikes);
		List matchingMandolins=inventory.search(whtTrishaLikes);
		
		if (!matchingGuitars.isEmpty()) {
			System.out.println("\nMadhu,U might like these guitars");
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				InstrumentSpec spec = Instrument.getSpec();
				System.out.println("\n" + spec.getBuilder() + " "
						+ spec.getModel() + " " + spec.getType() + " Guitar\n"
						+ spec.getBackwood() + " back and sides \n"
						+ guitar.getPrice()
						+ " Price\n" + spec.getModel() + " Model");

			}
		} else
			System.out.println("No matching guitar found");

		if (!matchingMandolins.isEmpty()) {
			System.out.println("\nMadhu,U might like these Mandolins");
			for (Iterator i = matchingMandolins.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				InstrumentSpec spec = Instrument.getSpec();
				System.out.println("\n" + spec.getBuilder() + " "
						+ spec.getModel() + " " + spec.getType() + " Guitar\n"
						+ spec.getBackwood() + " back and sides \n"
						+ guitar.getPrice()
						+ " Price\n" + spec.getModel() + " Model");

			}
		} else
			System.out.println("No matching guitar found");

		
	}

	private static void initializeInventory(Inventory inventory) {

		inventory.addInstrument("V95693", 1800, new GuitarSpec(Builder.FENDER,
				"castor", Type.ACOUSTIC, Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD,
				17));
		inventory.addInstrument("1001", 2000, new GuitarSpec(Builder.FENDER,
				"castor", Type.ACOUSTIC, Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD,
				15));
		inventory.addInstrument("1002", 20000, new MandolinSpec(
				Builder.COLLINGS, "Mandolin", Type.ACOUSTIC, Style.A,
				Wood.ADIRONDACK, Wood.ALDER));

	}

}
