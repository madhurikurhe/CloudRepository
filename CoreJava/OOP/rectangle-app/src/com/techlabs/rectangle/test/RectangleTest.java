package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle test = new Rectangle();

		System.out.println("Area of Rectangle is: "
				+ test.calculateArea(10, 10));
		System.out.println("Area of Rectangle is: "
				+ test.calculateArea(20, 10));

	}
}
