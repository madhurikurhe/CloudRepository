package com.techlabs.threadSafe.SingleTon;

public class MainTest {
	  public static void main(String... args) {
	    ThreadSafeProduct.Instance().DoSomething();
	    ThreadSafeProduct.Instance().DoSomething();
	    ThreadSafeProduct.Instance().DoSomething();
	  }
}
