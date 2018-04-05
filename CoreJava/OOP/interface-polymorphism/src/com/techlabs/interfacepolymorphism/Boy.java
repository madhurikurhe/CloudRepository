package com.techlabs.interfacepolymorphism;

public class Boy implements Imanable,IEmotional{

	@Override
	public void cry() {
		System.out.println("Boy crying");
	}

	@Override
	public void laugh() {
		System.out.println("Boy laughing");
	}

	@Override
	public void wish() {
		System.out.println("Boy wishing");
	}

	@Override
	public void desire() {
		System.out.println("Boy departing");
	}

}
