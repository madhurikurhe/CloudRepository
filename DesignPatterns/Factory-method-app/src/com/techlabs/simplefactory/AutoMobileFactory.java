package com.techlabs.simplefactory;

public class AutoMobileFactory {

	static AutoMobileFactory factory;

	private AutoMobileFactory() {

	}

	public static AutoMobileFactory getInstanceofFactory() {
		if (factory == null) {
			factory = new AutoMobileFactory();
			return factory;
		}
		return factory;

	}

	public IAutomobile make(AutoType type) {
		if (type == null)
			return null;
		else if (type == AutoType.AUDI)
			return new Audi();
		else if (type == AutoType.BMW)
			return new BMW();
		else if (type == AutoType.TOYOTO)
			return new Toyoto();

		return null;

	}
}
