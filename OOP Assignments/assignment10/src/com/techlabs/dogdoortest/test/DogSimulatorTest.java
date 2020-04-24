package com.techlabs.dogdoortest.test;

import com.techlabs.dogdoortest.*;

public class DogSimulatorTest {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		BarkRecognizer recognizer = new BarkRecognizer(door);

		System.out.println("fido starts barking");
		recognizer.recognize("Woof");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}

		System.out.println("random dog starts barking");
		recognizer.recognize("awoo");
	}
}
