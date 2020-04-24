package com.techlabs.dogdoortest;

public class Remote {
	private DogDoor door;

	public Remote(DogDoor door) {
		this.door = door;
	}

	public void pressbutton() {
		door.open();
	}

	public DogDoor getDoor() {
		return door;
	}
}
