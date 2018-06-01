package com.techlabs.singleton;

public class Test {
	public static void main(String[] args) {
		DataService singleton = DataService.INSTANCE;
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
	}
}