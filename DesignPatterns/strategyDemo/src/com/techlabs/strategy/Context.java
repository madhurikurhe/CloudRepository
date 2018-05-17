package com.techlabs.strategy;

public class Context {

	private Istrategy strategy;

	public Context(Istrategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int number1, int number2) {
		return strategy.doOperation(number1, number2);

	}
}
