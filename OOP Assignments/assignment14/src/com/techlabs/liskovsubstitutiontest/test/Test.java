package com.techlabs.liskovsubstitutiontest.test;

import com.techlabs.liskovsubstitutiontest.*;

public class Test {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		Circle circle = new Circle();

		setData(rectangle);
		setData(square);
		setData(circle);

		printArea(rectangle);
		printArea(square);
		printArea(circle);
	}

	private static void printArea(Rectangle rectangle) {
		System.out.println("Area:" + rectangle.calculateArea());
	}

	private static void setData(Rectangle rectangle) {
		rectangle.setLength(4);
		rectangle.setBreath(8);
	}
}
