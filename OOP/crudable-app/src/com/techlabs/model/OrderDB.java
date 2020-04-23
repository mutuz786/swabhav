package com.techlabs.model;

public class OrderDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("order is creating");
	}

	@Override
	public void read() {
		System.out.println("order ir reading");
	}

	@Override
	public void update() {
		System.out.println("order is updating");
	}

	@Override
	public void delete() {
		System.out.println("order is deleting");
	}

}
