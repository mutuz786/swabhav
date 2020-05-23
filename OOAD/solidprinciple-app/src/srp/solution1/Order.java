package srp.solution1;

import java.util.UUID;

public class Order {
	private UUID id;
	private String name;
	private double cost;
	private float discountPercentage;

	public Order(UUID id, String name, double cost, float discountPercentage) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
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
}
