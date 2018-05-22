package com.techlabs.decoratorDemo;

public class VegFood implements IFood {

	@Override
	public String prepareFood() {
		return "Veg Food";
	}

	@Override
	public int foodPrice() {
		return 50;

	}

}
