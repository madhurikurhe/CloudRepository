package com.techlabs.adapter.pattern;

import java.util.Iterator;
import java.util.LinkedList;

public class SwbhavQ <T> implements Iterable<T> {
	LinkedList<T> adaptee=new LinkedList<T>();

	public LinkedList<T> enque(T i) {
		adaptee.addLast(i);
		return adaptee;
	}

	public LinkedList<T> deque() {
		adaptee.removeFirst();
		return adaptee;
	}

	@Override
	public Iterator<T> iterator() {
		
		return null;
	}

	
}



