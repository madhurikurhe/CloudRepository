package com.techlabs.circle.test;

import com.techlabs.circle.BorderStyle;
import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String srgs[]) {
		Circle c1 = new Circle(3, BorderStyle.DOTTED);
		Circle c2 = new Circle(2.3, BorderStyle.DOUBLE_BORDER);
		Circle c3 = new Circle(3.3, BorderStyle.SOLID);

		printDetails(c1);
		printDetails(c2);
		printDetails(c3);
		printDetails(new Circle(10, BorderStyle.DOTTED));

	}

	public static void printDetails(Circle circle) {
		System.out.println("Area of Circle is: " + circle.calculateArea());
		System.out.println("Border of Circle: " + circle.getborder());
		System.out.println("Radius of Circle: " + circle.getRadius());

	}
}
