package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import com.techlabs.model.*;
import com.techlabs.model.Order;

class CustomerUnitTest {
	Customer murtaza;
	Order order;

	@BeforeEach
	void init() throws ParseException {
		murtaza = new Customer(UUID.randomUUID(), "vishal", "Thane");
		order = new Order(UUID.randomUUID(), new SimpleDateFormat("dd-MMM-yyyy").parse("23-MAY-2020"));
	}

	@Test
	void test_addOrderMethod_AddingOneOrderShouldIncreaseSizeOfOrders() {
		murtaza.addOrder(order);
		int expected = 1;
		int actual = murtaza.getOrders().size();
		assertEquals(expected, actual);
	}

	@Test
	void test_addOrderMethod_PassDublicateOrderButDublicateOrderShouldNotBeAdded() {
		murtaza.addOrder(order);
		murtaza.addOrder(order);
		murtaza.addOrder(order);
		int expected = 1;
		int actual = murtaza.getOrders().size();
		assertEquals(expected, actual);
	}
}
