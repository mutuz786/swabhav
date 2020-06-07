package com.techlabs.openclosedprincipletest;

public class Rectangle implements Shape {
	private float length;
	private float breath;

	public Rectangle(double length, double breath) {
		this.length = (float) length;
		this.breath = (float) breath;
	}

	@Override
	public float calculateArea() {
		return length * breath;
	}

	@Override
	public float calculatePerimeter() {
		return length + breath;
	}

	public float getLength() {
		return length;
	}

	public float getBreath() {
		return breath;
	}
}
