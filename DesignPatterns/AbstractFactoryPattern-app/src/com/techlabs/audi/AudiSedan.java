package com.techlabs.audi;

import com.techlabs.abstractpattern.IAutomobile;

public class AudiSedan implements IAutomobile {
	@Override
	public void start() {
		System.out.println("Audi Sedan started");
	}

	@Override
	public void stop() {
		System.out.println("Audi Sedan stopped");
	}

}
