package srp.refractor;

public class InvoicePrinter {

	public void printDetails(Invoice invoice) {
		System.out.println("Invoice ID:" + invoice.getId());
		System.out.println("Invoice Name:" + invoice.getName());
		System.out.println("Discount:" + invoice.getDiscount());
		System.out.println("Invoice TotalCost after Discount:"
				+ invoice.calculateTotalCost());

	}
}
