package com.techlabs.thistest;

public class ClassInstance {
	int width;
	int height;

	public ClassInstance() {
		width = 10;
		height = 5;
	}

	public ClassInstance(int pwidth, int pheight) {
		width = pwidth;
		height = pheight;
	}

	public ClassInstance getDefault() {
		return this;
	}

	public int calculateArea() {
		return width * height;
	}

}
