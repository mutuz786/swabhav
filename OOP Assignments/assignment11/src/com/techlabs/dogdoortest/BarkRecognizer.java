package com.techlabs.dogdoortest;

import java.util.ArrayList;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		ArrayList<Bark> barks=door.getBarks();
		for(Bark eachBark:barks) {
			if (bark.equals(eachBark)){
				door.open();
				break;
			}
		}
		if(!door.isOpen())
			System.out.println("the door doesnt open");
	}
}
