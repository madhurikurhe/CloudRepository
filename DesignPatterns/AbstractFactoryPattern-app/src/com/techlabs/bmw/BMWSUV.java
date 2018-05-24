package com.techlabs.bmw;

import com.techlabs.abstractpattern.IAutomobile;

public class BMWSUV implements IAutomobile {
	@Override
	public void start() {
		System.out.println("BMW SUV started");
	}

	@Override
	public void stop() {
		System.out.println("BMW SUV stopped");
	}

}
	
