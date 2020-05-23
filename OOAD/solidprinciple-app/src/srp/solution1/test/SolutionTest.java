package srp.solution1.test;

import java.util.UUID;

import srp.solution1.Invoice;
import srp.solution1.Order;

public class SolutionTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice(new Order(UUID.randomUUID(), "Murtaza", 100, 0.25f));
		printInfo(invoice);
	}

	private static void printInfo(Invoice invoice) {
		Order order = invoice.getOrder();
		System.out.println("Id:" + order.getId() + "\nName:" + order.getName() + "\nCost:" + order.getCost()
				+ "\nDiscountPercentage:" + order.getDiscountPercentage() + "\nGST:" + invoice.getGST() + "\nTotalCost:"
				+ invoice.calculateTotalCost());

	}
}
