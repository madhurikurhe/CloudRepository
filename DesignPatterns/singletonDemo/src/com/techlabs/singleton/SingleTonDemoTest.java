package com.techlabs.singleton;

public class SingleTonDemoTest {
public static void main(String[] args) {
	
	SingleTonDemo x= SingleTonDemo.singletonInstance();
	SingleTonDemo y= SingleTonDemo.singletonInstance();
	SingleTonDemo z= SingleTonDemo.singletonInstance();
	
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	
}
}
