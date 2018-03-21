package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		//caseStudy1();
	}

	private static void caseStudy1() {
		Rectangle rectangle2 = new Rectangle();
		Rectangle rectangle1 = new Rectangle();

		rectangle2.setHeight(-10);
		rectangle2.setWidth(101);
		rectangle2.setColor("bluE");

		rectangle1.setHeight(10);
		rectangle1.setWidth(20);
		rectangle1.setColor("pink");

		printDetails(rectangle1);
		printDetails(rectangle2);
	}

	public static void printDetails(Rectangle rectangle) {

		System.out.println("Area of Rectangle is: " + rectangle.calculateArea());
		System.out.println("Height is:" + rectangle.getHeight());
		System.out.println("Width is:" + rectangle.getWidth());
		System.out.println("Color is:" + rectangle.getColor());
		System.out.println("HASH CODE" + rectangle.hashCode());
	
	}
}
