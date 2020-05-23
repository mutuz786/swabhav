package srp.violation.test;

import java.util.UUID;

import srp.violation.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice(UUID.randomUUID(), "Murtaza", 100, 0.25f);
		invoice.print();
	}
}
