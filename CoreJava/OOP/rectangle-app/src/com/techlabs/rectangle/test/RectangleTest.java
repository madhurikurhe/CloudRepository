package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle test = new Rectangle(10, 10);
		System.out.println("Area of Rectangle is: " + test.calculateArea());

		Rectangle test1 = new Rectangle(20, 20);
		System.out.println("Area of Rectangle is: " + test1.calculateArea());

	}
}
