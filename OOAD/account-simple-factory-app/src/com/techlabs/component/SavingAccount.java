package com.techlabs.component;

class SavingAccount implements Account {
	private int id;
	private String name;
	private int balance = 0;

	@Override
	public void setAccno(int id) {
		this.id = id;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void deposit(int amount) {
		balance += amount;
	}

	@Override
	public void withdraw(int amount) {
		if (balance - amount < 2000) {
			System.err.println("underbalance account");
			return;
		}
		balance -= amount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

}
