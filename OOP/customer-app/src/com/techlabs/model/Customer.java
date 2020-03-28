package com.techlabs.model;

public class Customer {
	private String id;
	private String name;
	private int orders;
	private static int next;
	static {
		next = 1000;
	}

	public Customer(String name, int orders) {
		this.name = name;
		this.orders = orders;
		next++;
		this.id = "C".concat(String.valueOf(next));
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getOrders() {
		return orders;
	}
}
