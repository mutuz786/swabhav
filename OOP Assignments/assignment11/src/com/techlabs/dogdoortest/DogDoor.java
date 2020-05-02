package com.techlabs.dogdoortest;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private ArrayList<Bark> allowedBarks=new ArrayList<Bark>();

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

	public void addAllowedBarks(String bark) {
		Bark newBark=new Bark(bark);
		allowedBarks.add(newBark);
	}

	public ArrayList<Bark> getBarks() {
		return allowedBarks;
	}
}
