package com.techlab.circle;

public class Circle {
	private float radius;
	private final float pi = 3.14f;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float calculateArea() {
		return pi * radius * radius;
	}

	public float calculatePerimeter() {
		return 2 * pi * radius;
	}

}
