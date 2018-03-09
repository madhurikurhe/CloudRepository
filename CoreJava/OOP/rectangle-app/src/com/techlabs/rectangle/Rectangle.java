package com.techlabs.rectangle;

public class Rectangle {
	public int height;
	public int width;
	public int area;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height < 1 || height > 100)
			System.out.println("Height is not in range");
		else
			this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width < 1 || width > 100)
			System.out.println("Width is  not in range");
		else
		this.width = width;
	}

	public int calculateArea() {

		int area = height * width;
		return area;
	}

}
