package com.techlabs.junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

class TestCase {

	@Test
	void test() {
		Square square = new Square();
		assertEquals(4, square.calculateArea(2));
		assertEquals(4, square.calculateArea(5));
		org.junit.runner.Result result = JUnitCore.runClasses(Square.class);
		for (org.junit.runner.notification.Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

	}

}
