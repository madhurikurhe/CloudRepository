package com.techlabs.simplefactory;

public class BMWFactory implements IAutoFactory {

	@Override
	public IAutomobile make() {
		return new BMW();
	}

}
