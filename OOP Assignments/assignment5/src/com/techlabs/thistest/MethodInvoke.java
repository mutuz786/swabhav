package com.techlabs.thistest;

public class MethodInvoke {
	int width;
	int height;

	public int calculateArea() {
		this.setData(10, 5);
		return width * height;
	}

	private void setData(int pwidth, int pheight) {
		width += pwidth;
		height += pheight;
	}
}
