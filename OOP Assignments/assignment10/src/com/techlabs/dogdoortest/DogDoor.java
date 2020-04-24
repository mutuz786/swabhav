package com.techlabs.dogdoortest;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;

	public DogDoor() {
		open = false;
	}

	public void open() {
		System.out.println("dog door is opened");
		open = true;
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("dog door is closed");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}
}
