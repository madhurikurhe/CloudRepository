package com.techlabs.circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleJUnitTest {

	@Test
	public void testGetRadius() {
		Circle circle=new Circle(3);
		double result=circle.getRadius();
		assertTrue(3== result);
	}



}
