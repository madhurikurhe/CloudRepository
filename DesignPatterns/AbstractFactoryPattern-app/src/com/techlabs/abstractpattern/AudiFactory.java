package com.techlabs.abstractpattern;

import com.techlabs.audi.AudiHatchBack;
import com.techlabs.audi.AudiSUV;
import com.techlabs.audi.AudiSedan;

public class AudiFactory implements IAutoMobileFactory{

	@Override
	public IAutomobile makeHatchBack() {
		return new AudiHatchBack();
	}

	@Override
	public IAutomobile makeSedanBack() {
		return new AudiSedan();
	}

	@Override
	public IAutomobile makeSUV() {
		return new AudiSUV();
	}

}
