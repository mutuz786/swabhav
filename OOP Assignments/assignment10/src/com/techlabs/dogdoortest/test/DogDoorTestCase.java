package com.techlabs.dogdoortest.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.dogdoortest.DogDoor;

class DogDoorTestCase {
	DogDoor door = new DogDoor();

	@Test
	void test_openMethod_ChangeValueOfOpenToTrue() {
		door.open();
		boolean actual = door.isOpen();
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	void test_openMethod_ChangeValueOfOpenBackToFalse() {
		door.open();
		try {
			Thread.currentThread().sleep(6000);
		} catch (InterruptedException e) {
		}
		boolean actual = door.isOpen();
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	void test_closeMethod_ChangeValueOfOpenToFalse() {
		door.close();
		boolean actual = door.isOpen();
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
