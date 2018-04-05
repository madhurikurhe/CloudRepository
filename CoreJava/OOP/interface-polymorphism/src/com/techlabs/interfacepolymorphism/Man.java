package com.techlabs.interfacepolymorphism;

public class Man implements Imanable {

	@Override
	public void wish() {
		System.out.println("Man wish");
	}

	@Override
	public void desire() {
		System.out.println("Man depart");
	}
	
}
