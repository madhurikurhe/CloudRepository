package com.techlabs.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest extends ComparableDemo{
	public ComparableTest(String string, double d, int i){
		super(name,rating,year);
	}
	public static void main(String[] args)

	{
		ComparableTest c1=new ComparableTest("Movie1",8.3,2015);
		ComparableTest c2=new ComparableTest("Movie2",8.4,2013);
		ComparableTest c3=new ComparableTest("Movie3",8.5,2006);
		ComparableTest c4=new ComparableTest("Movie4",8.6,2018);
		ArrayList<ComparableDemo> list = new ArrayList<ComparableDemo>();
        
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		


		Collections.sort(list);

		System.out.println("Movies after sorting : ");

		for (ComparableDemo movie : list)

		{

			System.out.println(movie.getName() + " " +

			movie.getRating() + " " +

			movie.getYear());

		}

	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}