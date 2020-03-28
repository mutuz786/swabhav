package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountToString {
	public static void main(String[] args) {
		Account acc1=new Account(100,"Murtaza",1000);
		System.out.println(acc1);
		System.out.println(acc1.toString());
	}
}
