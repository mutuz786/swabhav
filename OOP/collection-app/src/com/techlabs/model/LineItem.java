package com.techlabs.model;

public class LineItem {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public LineItem(int id,String name,double price,int quantity) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public double calculateTotal(){
		return price*quantity;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
}
