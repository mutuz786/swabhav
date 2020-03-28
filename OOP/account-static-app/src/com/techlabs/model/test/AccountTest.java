package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account a1 = new Account(1500);
		System.out.println(a1.getMinBal());
		
		Account a2 = new Account(3500);
		Account.setMinBal(1000);
		System.out.println(a1.getMinBal());
		System.out.println(a2.getMinBal());
		
		Account a3 = new Account(4500);
		System.out.println(a3.getMinBal());
	}
}
