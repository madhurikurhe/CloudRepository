package lsp.refractor.test;


import lsp.refractor.Square;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testSubstitutionForSquare(){
		JunitTest test=new JunitTest();
		test.testAreaOfPolygon(new Square(10));
		
	}
}
