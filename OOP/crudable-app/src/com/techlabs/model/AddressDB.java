package com.techlabs.model;

public class AddressDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("address is creating");
	}

	@Override
	public void read() {
		System.out.println("address ir reading");
	}

	@Override
	public void update() {
		System.out.println("address is updating");
	}

	@Override
	public void delete() {
		System.out.println("address is deleting");
	}

}
