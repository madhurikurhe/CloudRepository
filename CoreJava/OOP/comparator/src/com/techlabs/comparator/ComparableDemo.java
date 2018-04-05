package com.techlabs.comparator;

public abstract class ComparableDemo implements Comparable<Object> {
	protected static double rating;

	protected static String name;

	protected static int year;

	public ComparableDemo(String name, double rating, int year) {
		this.name = name;

		this.rating = rating;

		this.year = year;

	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int compareTo(ComparableDemo m) {
		return this.year - m.getYear();
	}




}