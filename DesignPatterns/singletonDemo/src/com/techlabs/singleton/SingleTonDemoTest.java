package com.techlabs.singleton;

public class SingleTonDemoTest {
public static void main(String[] args) {
	
	DataService x= DataService.singletonInstance();
	DataService y= DataService.singletonInstance();
	DataService z= DataService.singletonInstance();
	
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	
}
}
