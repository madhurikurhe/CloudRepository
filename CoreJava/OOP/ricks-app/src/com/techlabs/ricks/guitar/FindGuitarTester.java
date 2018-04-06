package com.techlabs.ricks.guitar;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		inventory.display();

		GuitarSpec whatMadhuLikes = new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 17);
		List<Guitar> matchingGuitars = inventory.search(whatMadhuLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("\nMadhu,U might like these guitars");
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("\n" + spec.getBuilder() + " "
						+ spec.getModel() + " " + spec.getType() + " Guitar\n"
						+ spec.getBackwood() + " back and sides \n"
						+ spec.getTopwood() + " top \n" + guitar.getPrice()
						+ " Price\n" + spec.getModel() + " Model");

			}
		} else
			System.out.println("No matching guitar found");

	}

	private static void initializeInventory(Inventory inventory) {

		inventory.addGuitar("V95693", 1800, Builder.FENDER, "BlackBeauty",
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 17);
		inventory.addGuitar("V95694", 1200, Builder.FENDER, "Babysnakes",
				Type.ELECTRIC, Wood.CEDAR, Wood.MAHOGANY, 17);

		inventory.addGuitar("V95695", 1100, Builder.GIBSON, "Abel Axe",
				Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.COCOBOLO, 19);

		inventory.addGuitar("V95193", 1700, Builder.GIBSON, "Stratocastor",
				Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.COCOBOLO, 16);

	}

}
