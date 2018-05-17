package com.techlabs.strategy;

public class DoSubtraction implements Istrategy {

	@Override
	public int doOperation(int number1, int number2) {

		return number1 - number2;

	}

}
