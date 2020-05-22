package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.UUID;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import com.techlabs.model.*;

class LineItemTestUnit {
	LineItem item;
	Product book;

	@BeforeEach
	void init() throws ParseException {
		book = new Product(UUID.randomUUID(), "book", 500, 0.00f);
		item = new LineItem(UUID.randomUUID(), 21, book);
	}

	@Test
	void test_calculateItemCost_Return10500() {
		double expected = 21 * 500;
		double actual = item.calculateItemCost();
		assertEquals(expected, actual);
	}

	@Test
	void test_updateQuantityMethod_ChangeQuantityOfLineItem_Return30() {
		item.updateQuantity(9);
		int expected = 30;
		int actual = item.getQuantity();
		assertEquals(expected, actual);
	}

	@Test
	void test_calculateitemCost_AfterupdateQuantityMethod_ChangeQuantityOfLineItem_Return12500() {
		item.updateQuantity(4);
		double expected = 25 * 500;
		double actual = item.calculateItemCost();
		assertEquals(expected, actual);
	}

}
