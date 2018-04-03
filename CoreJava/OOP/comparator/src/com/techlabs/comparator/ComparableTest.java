package com.techlabs.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
	public static void main(String[] args)

	{

		ArrayList<ComparableDemo> list = new ArrayList<ComparableDemo>();

		list.add(new ComparableDemo("Force Awakens", 8.3, 2015));

		list.add(new ComparableDemo("Star Wars", 8.7, 1977));

		list.add(new ComparableDemo("Empire Strikes Back", 8.8, 1980));

		list.add(new ComparableDemo("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");

		for (ComparableDemo movie : list)

		{

			System.out.println(movie.getName() + " " +

			movie.getRating() + " " +

			movie.getYear());

		}

	}
}