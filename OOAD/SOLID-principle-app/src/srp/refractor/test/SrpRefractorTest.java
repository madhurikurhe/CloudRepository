package srp.refractor.test;

import srp.refractor.Invoice;
import srp.refractor.InvoicePrinter;

public class SrpRefractorTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "ABC", 1000, 10);
		InvoicePrinter srp = new InvoicePrinter();
		srp.printDetails(invoice);
	}
}
