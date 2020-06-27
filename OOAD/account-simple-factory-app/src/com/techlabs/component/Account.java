package com.techlabs.component;

public interface Account {
	public void setAccno(int id);

	public void setName(String name);

	public void deposit(int amount);

	public void withdraw(int amount);

	public int getId();

	public String getName();

	public int getBalance();
}
