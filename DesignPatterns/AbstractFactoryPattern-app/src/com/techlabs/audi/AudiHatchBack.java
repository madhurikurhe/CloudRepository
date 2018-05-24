package com.techlabs.audi;

import com.techlabs.abstractpattern.IAutomobile;

public class AudiHatchBack implements IAutomobile{
	@Override
	public void start() {
		System.out.println("Audi hatchBack started");
	}

	@Override
	public void stop() {
		System.out.println("Audi hatchBack stopped");
	}

}
