package com.techlabs.bmw;

import com.techlabs.abstractpattern.IAutomobile;

public class BMWSedan implements IAutomobile {
	@Override
	public void start() {
		System.out.println("BMW sedan started");
	}

	@Override
	public void stop() {
		System.out.println("BMW sedan stopped");
	}

}
