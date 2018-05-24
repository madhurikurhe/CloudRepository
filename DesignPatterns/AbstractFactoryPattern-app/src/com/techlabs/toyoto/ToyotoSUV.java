package com.techlabs.toyoto;

import com.techlabs.abstractpattern.IAutomobile;

public class ToyotoSUV  implements IAutomobile{
	@Override
	public void start() {
		System.out.println("Toyoto SUV started");
	}

	@Override
	public void stop() {
		System.out.println("Toyoto SUV stopped");
	}

}
