package com.techlabs.simplefactory;

public class Toyoto implements IAutomobile {
	@Override
	public void start() {
		System.out.println("Toyoto Started");
	}

	@Override
	public void stop() {
		System.out.println("Toyoto Stopped");
	}

}
