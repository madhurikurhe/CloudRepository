package com.techlabs.test;

public class Rectangle {

	private int height;
	private int width;
	private int area;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;

	}

	public int calculateArea() {
		this.area = height * width;
		return area;

	}
}