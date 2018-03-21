package com.techlabs.rectangle;

public class Rectangle {
	private int height;
	private int width;
	private String color;

	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {

		this.height = checkRange(height);
	}

	public void setWidth(int width) {

		this.width = checkRange(width);
	}

	public int getWidth() {
		return width;
	}

	public int checkRange(int parameter) {

		if (parameter < 1)
			return parameter = 1;
		if (parameter > 100)
			return parameter = 100;
		return parameter;

	}

	public int calculateArea() {

		int area = this.height * this.width;
		return area;
	}

	public String checkColor(String color2) {
		if (color2.equalsIgnoreCase("red") || color2.equalsIgnoreCase("green")
				|| color2.equalsIgnoreCase("blue"))
			return this.color = color2;

		return this.color = "red";

		// return color;
	}

	public void setColor(String color) {
		this.color = checkColor(color);

	}

	public String getColor() {
		return color;
	}

}
