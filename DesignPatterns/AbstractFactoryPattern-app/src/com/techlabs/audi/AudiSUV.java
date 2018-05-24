package com.techlabs.audi;

import com.techlabs.abstractpattern.IAutomobile;

public class AudiSUV implements IAutomobile {
	@Override
	public void start() {
		System.out.println("Audi SUV started");
	}

	@Override
	public void stop() {
		System.out.println("Audi SUV stopped");
	}

}
