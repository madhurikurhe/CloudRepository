package com.techlabs.toyoto;

import com.techlabs.abstractpattern.IAutomobile;

public class ToyotoHatchBack implements IAutomobile {
	@Override
	public void start() {
		System.out.println("Toyoto hatchBack started");
	}

	@Override
	public void stop() {
		System.out.println("Toyoto hatchBack stopped");
	}

}
