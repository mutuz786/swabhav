package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	private String color;

	public Rectangle(int pwidth, int pheight, String pcolor) {
		width = validateParameter(pwidth);
		height = validateParameter(pheight);
		color = validatecolor(pcolor);
	}

	public Rectangle(int pwidth, int pheight) {
		width = validateParameter(pwidth);
		height = validateParameter(pheight);
		color = "red";
	}

	private String validatecolor(String colorParameter) {
		if (colorParameter == null)
			return "red";
		if (colorParameter.equalsIgnoreCase("red") || colorParameter.equalsIgnoreCase("blue")|| colorParameter.equalsIgnoreCase("green"))
			return colorParameter.toLowerCase();
		return "red";
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
