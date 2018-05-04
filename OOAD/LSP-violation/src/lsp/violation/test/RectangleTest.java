package lsp.violation.test;

import lsp.violation.Rectangle;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testSubstitutionForRectangle(){
		JunitTest test=new JunitTest();
		test.sholudNotChangedHeightIfWidthChanged(new Rectangle(10, 17));
		
	}

}
