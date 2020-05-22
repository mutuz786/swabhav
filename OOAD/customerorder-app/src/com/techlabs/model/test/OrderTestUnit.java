package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import com.techlabs.model.*;
import com.techlabs.model.Order;

class OrderTestUnit {
	Order order;
	Product book;
	LineItem item1, item2;

	@BeforeEach
	void init() throws ParseException {
		order = new Order(UUID.randomUUID(), new SimpleDateFormat("dd-MMM-yyyy").parse("23-MAY-2020"));
		book = new Product(UUID.randomUUID(), "book", 500, 0.00f);
		item1 = new LineItem(UUID.randomUUID(), 21, book);
		item2 = new LineItem(UUID.randomUUID(), 12, book);
	}

	@Test
	void test_addItemMethod_AddingOneItemhouldIncreaseSizeOfOrders() throws ParseException {
		order.addItem(item1);
		int expected = 1;
		int actual = order.getItems().size();
		assertEquals(expected, actual);
	}

	@Test
	void test_addItemMethod_PassADublicateItemButDublicateItemShouldNotBeAdded_InsteadUpdateItemQuantity() {
		order.addItem(item1);
		order.addItem(item1);
		int expected = 42;
		int actual = order.getItems().get(0).getQuantity();
		assertEquals(expected, actual);
	}

	@Test
	void test_addItemMethod_PassAItemsWithSameProductButOrderShouldNotBeAdded_InsteadUpdateItemQuantity() {
		order.addItem(item1);
		order.addItem(item2);
		int expected = 33;
		int actual = order.getItems().get(0).getQuantity();
		assertEquals(expected, actual);
	}

	@Test
	void test_checkoutCostMethod_PassQuantityAs4_Return16500() {
		order.addItem(item2);
		order.addItem(item1);
		double expected = (21 + 12) * 500;
		double actual = order.checkoutCost();
		assertEquals(expected, actual);
	}
}
