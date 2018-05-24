package com.techlabs.simplefactory;

public class BMW implements IAutomobile{
	@Override
	public void start() {
		System.out.println("BMW Started");
	}

	@Override
	public void stop() {
		System.out.println("BMW Stopped");
	}

}
