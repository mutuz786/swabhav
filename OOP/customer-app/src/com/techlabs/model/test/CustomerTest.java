package com.techlabs.model.test;

import com.techlabs.model.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("murtaza", 10);
		System.out.println(c1.getId());
		Customer c2 = new Customer("murtaza", 10);
		System.out.println(c2.getId());
		Customer c3 = new Customer("murtaza", 10);
		System.out.println(c3.getId());
	}
}
