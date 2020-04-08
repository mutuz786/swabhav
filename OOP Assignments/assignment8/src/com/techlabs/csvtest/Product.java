package com.techlabs.csvtest;

public class Product {
	int id;
	String item;
	int price;
	double discount;

	public Product(int id, String item, int price, double discount) {
		this.id = id;
		this.item = item;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public String getItem() {
		return item;
	}

	public int getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	public double calculatePrice() {
		return price - price * discount;
	}
}
