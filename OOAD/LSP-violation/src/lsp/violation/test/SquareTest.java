package lsp.violation.test;

import lsp.violation.Square;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testSubstitutionForSquare(){
		JunitTest test=new JunitTest();
		test.sholudNotChangedHeightIfWidthChanged(new Square(15, 15));
		
	}
}
