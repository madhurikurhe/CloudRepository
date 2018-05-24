package com.techlabs.abstractpattern.test;

import com.techlabs.abstractpattern.AudiFactory;
import com.techlabs.abstractpattern.IAutoMobileFactory;
import com.techlabs.abstractpattern.IAutomobile;

public class Test {
	public static void main(String[] args) {
		IAutoMobileFactory f= new AudiFactory();
		
		IAutomobile auto=f.makeHatchBack();
		auto.start();
		auto.stop();
		
		IAutomobile auto1=f.makeSedanBack();
		auto1.start();
		auto1.stop();
		
		IAutomobile auto2=f.makeSUV();
		auto2.start();
		auto2.stop();
		
		
	}
}
