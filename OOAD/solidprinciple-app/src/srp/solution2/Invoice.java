package srp.solution2;

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

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}

	public float getGST() {
		return GST;
	}
}
