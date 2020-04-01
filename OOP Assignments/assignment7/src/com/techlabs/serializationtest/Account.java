package com.techlabs.serializationtest;

public class Account {
	private String name = "";
	private int id = 0;
	private float balance = 0f;

	public  Account(int id, String name, float balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public float getBalance() {
		return balance;
	}
}