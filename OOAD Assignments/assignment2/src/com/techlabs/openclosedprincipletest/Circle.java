package com.techlabs.openclosedprincipletest;

public class Circle implements Shape {
	private final float pi = 3.14f;
	private float radius;

	public Circle(double radius) {
		this.radius = (float) radius;
	}

	@Override
	public float calculateArea() {
		return pi * radius * radius;
	}

	@Override
	public float calculatePerimeter() {
		return 2 * pi * radius;
	}

	public float getRadius() {
		return radius;
	}
}
