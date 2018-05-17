package com.techlabs.factory;

public class ShapeFactory {

	public IShape getShape(String shapeType) {
		if (shapeType == null)
			return null;
		else if (shapeType == "Circle")
			return new Circle();
		else if (shapeType == "Square")
			return new Square();
		else if (shapeType == "Rectangle")
			return new Rectangle();

		return null;

	}
}
