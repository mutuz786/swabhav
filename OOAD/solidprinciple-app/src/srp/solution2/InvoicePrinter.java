package srp.solution2;

public class InvoicePrinter {
	private Invoice invoice;

	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}

	public void print() {
		System.out.println("Id:" + invoice.getId() + "\nName:" + invoice.getName() + "\nCost:" + invoice.getCost()
				+ "\nDiscountPercentage:" + invoice.calculateDiscountAmount() + "\nGST:" + invoice.getGST()
				+ "\nTotalCost:" + invoice.calculateTotalCost());
	}

}
