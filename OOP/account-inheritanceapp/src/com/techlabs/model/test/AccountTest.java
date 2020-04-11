package com.techlabs.model.test;

import java.text.ParseException;

import com.techlabs.model.*;

public class AccountTest {
	public static void main(String[] args) throws ParseException {
		SavingAccount acc1 = new SavingAccount(100, "murtaza", 1000);
		acc1.withdraw(100);
		acc1.deposit(1000);
		acc1.withdraw(100);
		printInfo(acc1);
		CurrentAccount acc2 = new CurrentAccount(101, "Sagar", 0);
		acc2.withdraw(10000);
		acc2.withdraw(1000);
		printInfo(acc2);
	}

	private static void printInfo(Account acc) {
		System.out.println("accno:" + acc.getAccno() + "\nname:" + acc.getName() + "\nbalance:" + acc.getBalance());
	}
}
