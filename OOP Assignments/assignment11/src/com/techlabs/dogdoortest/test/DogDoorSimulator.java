package com.techlabs.dogdoortest.test;

import com.techlabs.dogdoortest.*;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		door.addAllowedBarks("rowlf");
		door.addAllowedBarks("rooowlf");
		door.addAllowedBarks("rawlf");
		door.addAllowedBarks("woof");
		BarkRecognizer recognizer=new BarkRecognizer(door);
		Remote remote=new Remote(door);
		
		System.out.println("bruce starts barking");
		recognizer.recognize(new Bark("rowlf"));
		System.out.println("bruce went outside");
		try {
			Thread.currentThread().sleep(6000);
		}catch(InterruptedException ex) {}
		System.out.println("bruce all done....\nbut he's studk outside");
		Bark smallBark=new Bark("yip");
		System.out.println("bitsie starts barking");
		recognizer.recognize(smallBark);
		
		try {
			Thread.currentThread().sleep(6000);
		}catch(InterruptedException ex) {}
		System.out.println("bruce starts barking");
		recognizer.recognize(new Bark("rooowlf"));
	
		System.out.println("bruce is back inside....");
		
	}
}
