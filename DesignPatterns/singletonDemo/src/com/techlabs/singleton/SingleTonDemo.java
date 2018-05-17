package com.techlabs.singleton;

public class SingleTonDemo {

	static SingleTonDemo singletonInstance=null;
	private SingleTonDemo(){
	
	}
	
	public static SingleTonDemo singletonInstance(){
		if(singletonInstance==null){
			singletonInstance= new SingleTonDemo();
			return singletonInstance;
		}
		return singletonInstance;
	}
}
