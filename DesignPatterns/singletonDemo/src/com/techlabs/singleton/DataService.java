package com.techlabs.singleton;

public class DataService {

	static DataService singletonInstance=null;
	private DataService(){
	
	}
	
	public static DataService singletonInstance(){
		if(singletonInstance==null){
			singletonInstance= new DataService();
			return singletonInstance;
		}
		return singletonInstance;
	}
}
