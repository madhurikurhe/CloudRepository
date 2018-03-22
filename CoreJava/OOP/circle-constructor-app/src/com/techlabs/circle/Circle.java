package com.techlabs.circle;

public class Circle {
	final private BorderStyle border;
	final private double radius;

	public Circle(double radius, BorderStyle border) {
		this.radius = radius;
		this.border = border;
	}

	public float calculateArea() {

		float area = (float) (Math.PI * this.radius * this.radius);
		return area;
	}

	public BorderStyle getborder() {

		return border;
	}

	public double getRadius() {
		return radius;
	}
}
