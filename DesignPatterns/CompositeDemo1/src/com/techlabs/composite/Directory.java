package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IDOMElement {

	List<IDOMElement> elementList = new ArrayList<IDOMElement>();

	@Override
	public void display() {
		for (IDOMElement element : elementList) {
			element.display();
		}
	}

	public void addElement(IDOMElement element1) {
		elementList.add(element1);
	}

	public void removeElement(IDOMElement element1) {
		elementList.remove(element1);
	}

}
