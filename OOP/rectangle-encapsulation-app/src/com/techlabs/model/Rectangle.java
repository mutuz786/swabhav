package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
//dry violation in changeWidth and changeHeight
	public void changeWidth(int pwidth) {
		if (pwidth < 1)
			width = 1;
		else if (pwidth > 100)
			width = 100;
		else
			width = pwidth;
	}

	public void changeHeight(int pheight) {
		if (pheight < 1)
			height = 1;
		else if (pheight > 100) //remove magic numbers 
			height = 100;
		else
			height = pheight;
	}

	public int readWidth() {
		return width;
	}

	public int readHeight() {
		return height;
	}
}
