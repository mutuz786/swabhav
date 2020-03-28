package com.techlabs.model;

public class Customer {
	private String id;
	private String name;
	private int orders;
	private static int count=0;
	
	public Customer(String name,int orders) {
		this.name=name;
		this.orders=orders;
		count++;
		this.id="C100"+count;
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
