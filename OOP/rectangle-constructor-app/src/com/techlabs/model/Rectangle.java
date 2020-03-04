package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	private String color;

	public Rectangle(int pwidth, int pheight, ColorType pcolor) {
		width = validateParameter(pwidth);
		height = validateParameter(pheight);
		color = validateColor(pcolor);
	}

	public Rectangle(int pwidth, int pheight) {
		width = validateParameter(pwidth);
		height = validateParameter(pheight);
		color = ColorType.RED.toString();
	}

	private String validateColor(ColorType color) {
		if (color == null)
			return ColorType.RED.toString();
		return color.toString();
	}

	private int validateParameter(int parameter) {
		final int LOWER_LIMIT = 1;
		if (parameter < LOWER_LIMIT)
			return LOWER_LIMIT;
		return parameter;
	}

	public int calculateArea() {
		return (width * height);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

}
