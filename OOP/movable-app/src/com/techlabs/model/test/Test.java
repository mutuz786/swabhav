package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {
	public static void main(String[] args) {
		IMovable[] imovable=new IMovable[3];
		imovable[0]=new Bike();
		imovable[1]=new Car();
		imovable[2]=new Truck();
		startRace(imovable);
	}

	private static void startRace(IMovable[] objects) {
		for(IMovable object:objects)
			object.move();
	}
}
