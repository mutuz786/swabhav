package com.techlabs.dogdoortest;

public class BarkRecognizer {
	private DogDoor door;
	private final String FOO_BARK = "woof";

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(String bark) {
		if (bark.equalsIgnoreCase(FOO_BARK))
			door.open();
		else
			System.out.println("the door doesnt open");
	}
}
