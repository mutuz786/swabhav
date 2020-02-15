package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	
	private int UPPER_LIMIT=100;
	private int LOWER_LIMIT=1;
	public void changeWidth(int pwidth) {
		if (pwidth < LOWER_LIMIT)
			width = LOWER_LIMIT;
		else if (pwidth > UPPER_LIMIT)
			width = UPPER_LIMIT;
		else
			width = pwidth;
	}

	public void changeHeight(int pheight) {
		if (pheight < LOWER_LIMIT)
			height = LOWER_LIMIT;
		else if (pheight > UPPER_LIMIT)
			height = UPPER_LIMIT;
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
