package com.techlabs.multipleinterface;

public class MultipleInterface implements Third {

	@Override
	public void test1() {
		System.out.println("Testing method 1");
	}

	@Override
	public void test2() {
		System.out.println("Testing method 2");
	}

	@Override
	public void test3() {
		System.out.println("Testing method 3");
	}

}
