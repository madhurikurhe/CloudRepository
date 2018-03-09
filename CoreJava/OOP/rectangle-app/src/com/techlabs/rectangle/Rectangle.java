package com.techlabs.rectangle;

public class Rectangle {
	public static int height;
	public static int width;

	public Rectangle(int height1, int width1) {
		height = height1;
		width = width1;
	}

	public static int calculateArea() {
		int area = height * width;
		return area;

	}

}
