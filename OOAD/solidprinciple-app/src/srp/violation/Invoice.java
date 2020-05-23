package srp.violation;

import java.util.UUID;

public class Invoice {
	private UUID id;
	private String name;
	private double cost;
	private float discountPercentage;
	private final static float GST = 0.12f;

	public Invoice(UUID id, String name, double cost, float discountPercentage) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
	}

	public double calculateTax() {
		return cost * GST;
	}

	public double calculateDiscountAmount() {
		return cost * discountPercentage;
	}

	public double calculateTotalCost() {
		return cost - calculateDiscountAmount() + calculateTax();
	}

	public void print() {
		System.out.println("Id:" + id + "\nName:" + name + "\nCost:" + cost + "\nDiscountPercentage:"
				+ discountPercentage + "\nGST:" + GST + "\nTotalCost:" + calculateTotalCost());
	}
}
