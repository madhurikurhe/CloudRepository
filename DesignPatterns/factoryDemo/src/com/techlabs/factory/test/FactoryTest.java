package com.techlabs.factory.test;

import com.techlabs.factory.IShape;
import com.techlabs.factory.ShapeFactory;

public class FactoryTest {
	public static void main(String[] args) {
		ShapeFactory shapefactory=new ShapeFactory();
		
		IShape shape1= shapefactory.getShape("Circle");
		shape1.draw();
		
		IShape shape2= shapefactory.getShape("Rectangle");
		shape2.draw();
		
		IShape shape3= shapefactory.getShape("Square");
		shape3.draw();
		
		
	}
}