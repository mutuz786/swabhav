package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	
	private int UPPER_LIMIT=100;
	private int LOWER_LIMIT=1;
												//dry violation in changeWidth and changeHeight
	  											//Tried to remove dry but had to change the behaviour of theclass diagram
	public void changeWidth(int pwidth) {
		width=getValue(pwidth);
	}

	public void changeHeight(int pheight) {
		height=getValue(pheight);
	}
	
	private int getValue(int value) {
		if (value < LOWER_LIMIT)
			return LOWER_LIMIT;
		else if (value > UPPER_LIMIT)
			return UPPER_LIMIT;
		return value;
	}
	
	public int readWidth() {
		return width;
	}

	public int readHeight() {
		return height;
	}
}
