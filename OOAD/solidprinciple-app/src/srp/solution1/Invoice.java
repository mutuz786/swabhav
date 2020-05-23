package srp.solution1;

public class Invoice {
	private final static float GST = 0.12f;
	private Order order;

	public Invoice(Order order) {
		this.order = order;
	}

	public double calculateTax() {
		return order.getCost() * GST;
	}

	public double calculateDiscountAmount() {
		return order.getCost() * order.getDiscountPercentage();
	}

	public double calculateTotalCost() {
		return order.getCost() - calculateDiscountAmount() + calculateTax();
	}

	public Order getOrder() {
		return order;
	}

	public float getGST() {
		return GST;
	}
}
