package com.techlabs.abstractpattern;

import com.techlabs.toyoto.ToyotoHatchBack;
import com.techlabs.toyoto.ToyotoSUV;
import com.techlabs.toyoto.ToyotoSedan;

public class ToyotoFactory implements IAutoMobileFactory {

	@Override
	public IAutomobile makeHatchBack() {
		return new ToyotoHatchBack();
	}

	@Override
	public IAutomobile makeSedanBack() {
		return new ToyotoSedan();
	}

	@Override
	public IAutomobile makeSUV() {
		return new ToyotoSUV();
	}

}
