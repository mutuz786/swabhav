package com.techlabs.model;

public class CustomerDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("customer is creating");
	}

	@Override
	public void read() {
		System.out.println("customer ir reading");
	}

	@Override
	public void update() {
		System.out.println("customer is updating");
	}

	@Override
	public void delete() {
		System.out.println("customer is deleting");
	}

}
