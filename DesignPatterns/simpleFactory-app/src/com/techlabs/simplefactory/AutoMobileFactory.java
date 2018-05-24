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


}
