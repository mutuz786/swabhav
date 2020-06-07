package com.techlabs.openclosedprincipletest.test;

import com.techlabs.openclosedprincipletest.*;

public class Test {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 5);
		printArea(rectangle);
		printPerimeter(rectangle);
		Circle circle = new Circle(10);
		printArea(circle);
		printPerimeter(circle);
	}

	private static void printPerimeter(Shape shape) {
		System.out.println("Perimeter:" + shape.calculatePerimeter());
	}

	private static void printArea(Shape shape) {
		System.out.println("Area:" + shape.calculateArea());
	}
}
