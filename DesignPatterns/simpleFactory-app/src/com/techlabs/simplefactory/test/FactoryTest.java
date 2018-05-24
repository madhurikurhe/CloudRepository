package com.techlabs.simplefactory.test;

import com.techlabs.simplefactory.AutoMobileFactory;
import com.techlabs.simplefactory.AutoType;
import com.techlabs.simplefactory.IAutomobile;


public class FactoryTest {
	public static void main(String[] args) {
		AutoMobileFactory autofactory=AutoMobileFactory.getInstanceofFactory();
		
		IAutomobile auto=autofactory.make(AutoType.AUDI);
		auto.start();
		auto.stop();
		
		IAutomobile auto1=autofactory.make(AutoType.TOYOTO);
		auto1.start();
		auto1.stop();
		
		IAutomobile auto2=autofactory.make(AutoType.BMW);
		auto2.start();
		auto2.stop();
		
		
		
	}
}
