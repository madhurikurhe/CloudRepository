package com.techlabs.adapter.pattern;

import java.util.Iterator;
import java.util.LinkedList;

public class SwbhavQTest {
	public static void main(String[] args) {
		SwbhavQ<Integer> noQ=new SwbhavQ<Integer>();
		noQ.enque(10);
		noQ.enque(20);
		noQ.enque(30);
		noQ.enque(40);
		LinkedList<Integer> q = noQ.enque(50);
		
		System.out.println(q.size());
		
		noQ.deque();
		q=noQ.deque();
		
		System.out.println(q.size());
		
		for(int n:noQ){
			System.out.println(n);
		}
		System.out.println("**Iterator**");
	      Iterator i = noQ.iterator();
	      while (i.hasNext()) {
		  System.out.println(i.next());
	      }	      
	
	}

}