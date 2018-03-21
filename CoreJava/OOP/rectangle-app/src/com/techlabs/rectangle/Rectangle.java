package com.techlabs.rectangle;

public class Rectangle {
	public int height;
	public int width;
	public int area;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height < 1) {
			this.height = 1;
			System.out.println("Height is:" + this.height);
		}

		else if (height > 100) {
			this.height = 100;
			System.out.println("Height is:" + this.height);
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
			System.out.println("Width is:" + this.width);
		} else if (width > 100) {
			this.width = 100;
			System.out.println("Width is:" + this.width);
		}

		else
			this.width = width;
	}

	public int calculateArea() {

		int area = this.height * this.width;
		return area;
	}

}
