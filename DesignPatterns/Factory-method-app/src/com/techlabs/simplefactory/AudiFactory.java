package com.techlabs.simplefactory;

public class AudiFactory implements IAutoFactory {

	@Override
	public IAutomobile make() {
		return new Audi();
	}

}
