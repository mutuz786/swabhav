package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountEquality {
	public static void main(String[] args) {
		Account a1=new Account(101, "Murtaza", 1000);
		Account a2=new Account(101, "Murtaza", 1000);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		Account a3=a1;
		System.out.println(a1==a1);
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		
		System.out.println(a1.equals(a1));
		System.out.println(a1.equals(a2));
		
		
	}
}
