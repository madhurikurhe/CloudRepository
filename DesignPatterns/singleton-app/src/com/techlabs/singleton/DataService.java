package com.techlabs.singleton;

public class DataService {
	static DataService bucket=null;
	private DataService(){
	
	}
	
	public static DataService getInstance(){
		if(bucket==null){
			bucket= new DataService();
			return bucket;
		}
		return bucket;
	}
	
	public void doProcessing(){
	System.out.println(this.hashCode() +" is Processing");
	}
}

