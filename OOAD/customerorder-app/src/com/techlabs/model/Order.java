package com.techlabs.model;

import java.util.*;

public class Order {
	private UUID id;
	private Date date;
	private List<LineItem> items = new ArrayList<LineItem>();

	public Order(UUID id, Date date) {
		this.id = id;
		this.date = date;
	}

	public void addItem(LineItem item) {
		items.add(item);
	}

	public double checkoutCost() {
		double cost = 0;
		for (LineItem item : items) {
			cost += item.calculateItemCost();
		}
		return cost;
	}

	public UUID getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}
}
