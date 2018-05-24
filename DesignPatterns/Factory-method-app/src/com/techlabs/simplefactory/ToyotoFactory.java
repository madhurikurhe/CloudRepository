package com.techlabs.simplefactory;

public class ToyotoFactory implements IAutoFactory{

	@Override
	public IAutomobile make() {
		
		return new Toyoto(); 
	}

}
