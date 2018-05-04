package lsp.violation.test;

import static org.junit.Assert.assertEquals;
import lsp.violation.Rectangle;

public class JunitTest {

	public void sholudNotChangedHeightIfWidthChanged(Rectangle r) {
		int before = r.getHeight();
		r.setWidth(20);
		int after = r.getHeight();
		assertEquals(before, after);

	}
}

