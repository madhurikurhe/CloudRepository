package com.techlabs.ricks.guitar;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		List<Guitar> guitars=initializeInventory(inventory);
		
		GuitarSpec whatMadhuLikes = new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 17);
		List<Guitar> matchingGuitars = inventory.search(whatMadhuLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Madhu,U might like these guitars");
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

	private static List<Guitar> initializeInventory(Inventory inventory) {

		List<Guitar> guitars=null;
		inventory.addGuitar("V95693", 1500, Builder.FENDER, "Stratocastor",
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 17);
		inventory.addGuitar("V95694", 1600, Builder.FENDER, "ocastor",
				Type.ELECTRIC, Wood.CEDAR, Wood.MAHOGANY, 17);

		inventory.addGuitar("V95695", 1800, Builder.GIBSON, "castor",
				Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.COCOBOLO, 19);
		
		return guitars;
	}
	
	

}
