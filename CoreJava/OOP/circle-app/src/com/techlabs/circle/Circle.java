package com.techlabs.circle;

public class Circle {
	private BorderStyle border;
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double d) {

		this.radius = d;
	}

	public float calculateArea() {

		float area = (float) (Math.PI * this.radius * this.radius);
		return area;
	}

	public void setBorder(BorderStyle border) {

		this.border = border;
	}

	public BorderStyle getBorder() {
		return border;
	}

}
