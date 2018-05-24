package com.techlabs.toyoto;

import com.techlabs.abstractpattern.IAutomobile;

public class ToyotoSedan  implements IAutomobile{
	@Override
	public void start() {
		System.out.println("Toyoto Sedan started");
	}

	@Override
	public void stop() {
		System.out.println("Toyoto Sedan stopped");
	}

}
