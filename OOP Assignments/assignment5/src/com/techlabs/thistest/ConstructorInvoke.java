package com.techlabs.thistest;

public class ConstructorInvoke {
	int width;
	int height;

	public ConstructorInvoke() {
		this(10, 5);
	}

	private ConstructorInvoke(int pwidth, int pheight) {
		width = pwidth;
		height = pheight;
	}

	public int calculateArea() {
		return width * height;
	}

}
