package com.techlabs.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	private List<IBalanceObserver> observers;

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.observers = new ArrayList<IBalanceObserver>();
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			updateBalance();
		}
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			balance -= amount;
			updateBalance();
		}

	}

	private void updateBalance() {
		for (IBalanceObserver observer : observers) {
			observer.update(this);
		}
	}

	public void addBalanceObserver(IBalanceObserver observer) {
		observers.add(observer);
	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<IBalanceObserver> getObservers() {
		return observers;
	}
}
