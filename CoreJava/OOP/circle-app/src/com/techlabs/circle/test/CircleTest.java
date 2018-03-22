package com.techlabs.circle.test;

import com.techlabs.circle.BorderStyle;
import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String srgs[]) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();

		c1.setRadius(3);
		c1.setBorder(BorderStyle.SOLID);

		c2.setRadius(2.3);
		c2.setBorder(BorderStyle.DOUBLE_BORDER);

		c3.setRadius(3.3);
		c3.setBorder(BorderStyle.DOTTED);

		printDetails(c1);
		printDetails(c2);
		printDetails(c3);
		printDetails(new Circle());

	}

	public static void printDetails(Circle circle) {
		System.out.println("Area of Circle is: " + circle.calculateArea());
		System.out.println("Border of Circle: " + circle.getBorder());

	}
}
