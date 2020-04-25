package com.techlabs.dogdoortest.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.techlabs.dogdoortest.BarkRecognizer;
import com.techlabs.dogdoortest.DogDoor;

class BarkRecognizerTestCase {
	@Test
	void test_recognizeMethod_WithFooBarkSound_ChangeValueOfOpenToTrue() {
		testDog("woof",true);
	}
	@Test
	void test_recognizeMethod_WithFooHighPitchBarkSound_ChangeValueOfOpenToTrue() {
		testDog("WOOF",true);
	}
	@Test
	void test_recognizeMethod_WithRandomBarkSound_ValueOfOpenRemainsfalse() {
		testDog("AwoO",false);
	}
	
	@Before
	private void testDog(String bark, boolean expected) {
		DogDoor door=new DogDoor();
		BarkRecognizer recognizer =new BarkRecognizer(door);
		recognizer.recognize(bark);
		boolean actual=door.isOpen();
		assertEquals(expected, actual);		
	}
}
