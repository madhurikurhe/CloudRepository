package com.techlabs.bmw;

import com.techlabs.abstractpattern.IAutomobile;

public class BMWHatchBack implements IAutomobile {

	@Override
	public void start() {
		System.out.println("BMW hatchBack started");
	}

	@Override
	public void stop() {
		System.out.println("BMW hatchBack stopped");
	}

}
