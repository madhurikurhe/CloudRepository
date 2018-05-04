package lsp.refractor.test;


	import static org.junit.Assert.assertEquals;
import lsp.refractor.Polygon;

	public class JunitTest {

		public void testAreaOfPolygon(Polygon r) {
			int expectedArea=100;
			assertEquals(expectedArea,r.calculateArea());

		}
	}


