package srp.violation.test;

import static org.junit.Assert.*;

import org.junit.Test;

import srp.violation.Invoice;

public class InvoiceTest {

	@Test
	public void sholudCalculateTotalCostForProduct() {
		Invoice invoice = new Invoice(1, "ABC", 1000, 10);
		double expectedCost = 1100;

		invoice.setCost(1000);

		assertTrue(expectedCost == invoice.calculateTotalCost());

	}

	@Test
	public void sholudCreateInvoice() {
		Invoice invoice = new Invoice(1, "ABC", 1000, 10);

		assertTrue(1 == invoice.getId());
		assertEquals("ABC", invoice.getName());
		assertTrue(1000 == invoice.getCost());
		assertTrue(10 == invoice.getDiscount());

	}

	@Test
	public void sholudPrintDetails() {
		Invoice invoice = new Invoice(1, "ABC", 1000, 10);

			invoice.printDetails();
			
			
	}
	
}
