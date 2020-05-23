package srp.solution2.test;

import java.util.UUID;

import srp.solution2.*;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice(UUID.randomUUID(), "Murtaza", 100, 0.25f);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
		invoicePrinter.print();
	}
}
