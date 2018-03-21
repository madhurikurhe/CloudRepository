package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle test = new Rectangle();
		test.setHeight(-10);
		test.setWidth(101);
		test.setColor("bluE");
		System.out.println("Area of Rectangle is: " + test.calculateArea());
		System.out.println("Height is:" + test.getHeight());
		System.out.println("Width is:" + test.getWidth());
        System.out.println("Color is:" + test.getColor());
	}
}
