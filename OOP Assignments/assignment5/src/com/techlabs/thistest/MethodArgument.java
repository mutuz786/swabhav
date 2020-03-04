package com.techlabs.thistest;

public class MethodArgument {
	int width;
	int height;

	public MethodArgument() {
		width = 10;
		height = 5;
	}

	public int display() {
		return getArea(this);
	}

	private int getArea(MethodArgument argument) {
		return argument.width * argument.height;
	}

}
