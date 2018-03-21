package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle test = new Rectangle();
		// test.height=1000;
		test.setHeight(101);
		test.setWidth(-1);

		System.out.println("Area of Rectangle is: " + test.calculateArea());
		System.out.println("Height is:" + test.getHeight());
		System.out.println("Width is:" + test.getWidth());

	}
}
