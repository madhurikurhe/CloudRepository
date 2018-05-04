package lsp.refractor.test;


import lsp.refractor.Rectangle;

import org.junit.Test;

public class RectangleTest {
	@Test
	public void testSubstitutionForRectangle(){
		JunitTest test=new JunitTest();
		test.testAreaOfPolygon(new Rectangle(10,10));
	}
}
