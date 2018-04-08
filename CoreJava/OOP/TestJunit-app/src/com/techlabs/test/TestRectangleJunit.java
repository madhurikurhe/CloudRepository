package com.techlabs.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRectangleJunit {

	@Test
	public void testHeightInRange1To100() {
		Rectangle rectangle = new Rectangle();
		int expectedHeightLowerLimit = 0;
		int expectedHeightUpperLimit = 100;

		rectangle.setHeight(20);

		assertTrue(expectedHeightLowerLimit < rectangle.getHeight());
		assertTrue(expectedHeightUpperLimit > rectangle.getHeight());

	}

	@Test
	public void testWidthInRange1To100() {
		Rectangle rectangle = new Rectangle();
		int expectedWidthLowerLimit = 0;
		int expectedWidthUpperLimit = 100;

		rectangle.setWidth(20);

		assertTrue(expectedWidthLowerLimit < rectangle.getWidth());
		assertTrue(expectedWidthUpperLimit > rectangle.getWidth());

	}

	@Test
	public void testCalculateArea() {
		Rectangle rectangle = new Rectangle();
		int expectedArea = 1000;

		int result = rectangle.calculateArea();

		assertTrue(expectedArea > result);
	}
}
