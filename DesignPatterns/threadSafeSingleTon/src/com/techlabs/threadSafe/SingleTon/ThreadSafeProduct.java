package com.techlabs.threadSafe.SingleTon;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeProduct {

	private ThreadSafeProduct() { }
	  
	  public static ThreadSafeProduct Instance() {
	    return instance;
	  }
	  private static ThreadSafeProduct instance = new ThreadSafeProduct();
	  
	  public void DoSomething() {
	    lock.lock();
	    try {
	      state++;
	      System.out.println("I'm doing something for the " + state + " time");
	    }
	    finally {
	      lock.unlock();
	    }
	  }
	  private int state = 0;
	  private Lock lock = new ReentrantLock();
	}


