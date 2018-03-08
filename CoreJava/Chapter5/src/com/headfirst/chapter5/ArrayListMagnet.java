package com.headfirst.chapter5;

import java.util.*;

public class ArrayListMagnet {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "zero");
		a.add(1, "One");

		a.add(2, "Two");

		a.add(3, "Three");
		printAL(a);
		if (a.contains("three")) {
			a.add("four");
		}

		a.remove(2);
		printAL(a);
		if (a.indexOf("four") != 4) {
			a.add("4.2");
		}

		printAL(a);

		if (a.contains("two")) {
			a.add("2.2");
		}
		printAL(a);

	}

	public static void printAL(ArrayList<String> al) {
		// TODO Auto-generated method stub
		for (String element : al) {
			System.out.print(element + " ");
		}
		System.out.println(" ");

	}
}
