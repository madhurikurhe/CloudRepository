package com.techlabs.rto;


import java.util.Map;

public class DisplayAllData {

	public static void displayAll(Map<String, String> map) {
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}
		System.out.println(" ");
	}

}
