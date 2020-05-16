package com.techlabs.model;

import java.util.*;

public class LineItem {
	private UUID id;
	private int quantity;
	private Product product;

	public LineItem(UUID id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}

	public double calculateItemCost() {
		return quantity * product.totalCost();
	}

	public UUID getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

}
