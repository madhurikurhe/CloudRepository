package com.techlabs.simplefactory.test;

import com.techlabs.simplefactory.AudiFactory;
import com.techlabs.simplefactory.BMWFactory;
import com.techlabs.simplefactory.IAutoFactory;
import com.techlabs.simplefactory.IAutomobile;

public class FactoryTest {
	public static void main(String[] args) {

		IAutoFactory f = new BMWFactory();
		IAutomobile auto = f.make();
		auto.start();
		auto.stop();

		IAutoFactory f1 = new AudiFactory();
		IAutomobile auto1 = f1.make();
		auto1.start();
		auto1.stop();

		IAutoFactory f2 = new BMWFactory();
		IAutomobile auto2 = f2.make();
		auto2.start();
		auto2.stop();

	}
}
