package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.UUID;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import com.techlabs.model.*;

class ProductUnitTest {
	Product book;

	@BeforeEach
	void init() throws ParseException {
		book = new Product(UUID.randomUUID(), "book", 1000, 0.50f);
	}

	@Test
	void test_totalCostMethod_Return500() {
		double expected = 1000 - 1000 * 0.50f;
		double actual = book.totalCost();
		assertEquals(expected, actual);
	}
}
