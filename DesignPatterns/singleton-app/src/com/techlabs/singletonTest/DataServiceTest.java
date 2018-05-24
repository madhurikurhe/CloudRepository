package com.techlabs.singletonTest;

import com.techlabs.singleton.DataService;


public class DataServiceTest {
	public static void main(String[] args) {
		
		DataService x1=DataService.getInstance();
		DataService x2=DataService.getInstance();
		
		x1.doProcessing();
		x2.doProcessing();
		
	}
}
