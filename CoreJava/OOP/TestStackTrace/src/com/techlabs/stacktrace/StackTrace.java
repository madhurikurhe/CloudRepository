package com.techlabs.stacktrace;


public class StackTrace {
	public static void main(String[] args) {
		System.out.println("Start of main");
		try{
		m1();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("End of main");
	}
	public static void m1() throws Exception{
		System.out.println("Inside m1");
		m2();
	}
	private static void m2() throws Exception {
		System.out.println("Inside m2");
		m3();
	}
	
	private static void m3() throws Exception {
		System.out.println("Inside m3");
		throw new Exception("Error in m3");
	}
	
	
}
