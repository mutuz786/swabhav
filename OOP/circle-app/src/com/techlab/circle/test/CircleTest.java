package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleTest {
	public static void main(String[] args) {

		Circle r1 = new Circle();
		Circle r2 = new Circle();
		Circle r3 = new Circle();
		Circle r4 = new Circle();
		Circle r5 = new Circle();

		Circle[] circles = { r1, r2, r3, r4, r5 };

		circles[0].setRadius(5f);
		circles[1].setRadius(10f);
		circles[2].setRadius(2.5f);
		circles[3].setRadius(3f);
		circles[4].setRadius(6f);

		printInfo(circles);
		Circle big = findBigCircle(circles);
		System.out.println("Largest circle is radius " + big.getRadius());
		Circle small = findSmallCircle(circles);
		System.out.println("Smallest circle is radius " + small.getRadius());
		float bigPerimeter = findBigPerimeter(circles);
		System.out.println("The biggest circle has perimeter " + bigPerimeter);
	}

	private static float findBigPerimeter(Circle[] circles) {
		float value = 0;
		for (Circle circle : circles) {
			if (circle.calculatePerimeter() > value)
				value = circle.calculatePerimeter();
		}
		return value;
	}

	private static Circle findBigCircle(Circle[] circles) {
		return getCircle(circles, "big");
	}

	private static Circle findSmallCircle(Circle[] circles) {
		return getCircle(circles, "small");
	}

	private static Circle getCircle(Circle[] circles, String operation) {
		Circle value = circles[0];
		for (Circle circle : circles) {
			if (operation == "big" && circle.getRadius() > value.getRadius())
				value = circle;
			if (operation == "small" && circle.getRadius() < value.getRadius())
				value = circle;
		}
		return value;
	}

	private static void printInfo(Circle[] circles) {
		for (Circle circle : circles) {
			printInfo(circle);
		}
	}

	private static void printInfo(Circle circle) {
		System.out.printf("Radius:%f \t Area:%f \t Perimeter:%f \n", circle.getRadius(), circle.calculateArea(),
				circle.calculatePerimeter());
	}
}
