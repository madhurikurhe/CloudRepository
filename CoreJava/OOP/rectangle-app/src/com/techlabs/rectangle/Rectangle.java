package com.techlabs.rectangle;

public class Rectangle {
	private int height;
	private int width;
	private int area;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height < 1) {
			this.height = 1;

		}

		else if (height > 100) {
			this.height = 100;
		}

		else
			this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width < 1) {
			this.width = 1;
		} else if (width > 100) {
			this.width = 100;
		}

		else
			this.width = width;
	}

	public int calculateArea() {

		int area = this.height * this.width;
		return area;
	}

}
