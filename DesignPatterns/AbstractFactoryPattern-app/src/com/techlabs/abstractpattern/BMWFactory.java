package com.techlabs.abstractpattern;

import com.techlabs.bmw.BMWHatchBack;
import com.techlabs.bmw.BMWSUV;
import com.techlabs.bmw.BMWSedan;

public class BMWFactory implements IAutoMobileFactory {

	@Override
	public IAutomobile makeHatchBack() {
		return new BMWHatchBack();
	}

	@Override
	public IAutomobile makeSedanBack() {
		return new BMWSedan();
	}

	@Override
	public IAutomobile makeSUV() {
		return  new BMWSUV();
	}
	
}
