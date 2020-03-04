package com.techlabs.thistest;

public class InstanceReference {
	int width;
	int height;

	public InstanceReference(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int calculateArea() {
		return width * height;
	}
}
