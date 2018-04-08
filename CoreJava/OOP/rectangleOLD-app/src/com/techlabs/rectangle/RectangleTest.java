package com.techlabs.rectangle;

public class RectangleTest {
		 
		 	public static void main(String[] args) {
				Rectangle test = new Rectangle();
				test.setHeight(-10);
				test.setWidth(101);
				test.setColor("bluE");
				System.out.println("Area of Rectangle is: " + test.calculateArea());
				System.out.println("Height is:" + test.getHeight());
				System.out.println("Width is:" + test.getWidth());
		        System.out.println("Color is:" + test.getColor());
			//caseStudy1();
			}
		
			private static void caseStudy1() {
				Rectangle rectangle2 = new Rectangle();
				Rectangle rectangle1 = new Rectangle();
		
				rectangle2.setHeight(-10);
				rectangle2.setWidth(101);
				rectangle2.setColor("bluE");
		
				rectangle1.setHeight(10);
				rectangle1.setWidth(20);
				rectangle1.setColor("pink");
		
				printDetails(rectangle1);
				printDetails(rectangle2);
			}
		
			public static void printDetails(Rectangle rectangle) {
		
				System.out.println("Area of Rectangle is: " + rectangle.calculateArea());
				System.out.println("Height is:" + rectangle.getHeight());
				System.out.println("Width is:" + rectangle.getWidth());
				System.out.println("Color is:" + rectangle.getColor());
				System.out.println("HASH CODE" + rectangle.hashCode());
			
		 	}
		 }

