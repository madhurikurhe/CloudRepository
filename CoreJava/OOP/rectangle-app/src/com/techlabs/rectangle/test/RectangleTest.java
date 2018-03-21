package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle test = new Rectangle();
		test.setHeight(101);
		test.setWidth(-1);

		System.out.println("Area of Rectangle is: " + test.calculateArea());

	}
}
