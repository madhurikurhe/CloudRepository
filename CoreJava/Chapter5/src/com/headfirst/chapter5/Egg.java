package com.headfirst.chapter5;

import java.util.ArrayList;

public class Egg {
	public static void main(String[] args) {
		ArrayList<Egg> myList = new ArrayList<Egg>();
		Egg s = new Egg();
		myList.add(s);
		Egg b = new Egg();
		myList.add(b);

		Egg c = new Egg();
		myList.add(c);

		int theSize = myList.size();
		System.out.println("Size of array is " + theSize);

		boolean isIn = myList.contains(s);
		System.out.println("Is Array contains ?? " + isIn);

		int idx = myList.indexOf(c);
		System.out.println("B is at Location: " + idx);

		boolean empty = myList.isEmpty();
		System.out.println("Is List Empty?? " + empty);
	}

}
