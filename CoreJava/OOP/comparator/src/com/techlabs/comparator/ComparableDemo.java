package com.techlabs.comparator;

public class ComparableDemo implements Comparable<Object> {
	private double rating;

	private String name;

	private int year;

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


	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}



}