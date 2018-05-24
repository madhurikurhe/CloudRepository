package com.techlabs.abstractpattern;

public interface IAutoMobileFactory {
	public IAutomobile makeHatchBack();
	public IAutomobile makeSedanBack();
	public IAutomobile makeSUV();
	
}
