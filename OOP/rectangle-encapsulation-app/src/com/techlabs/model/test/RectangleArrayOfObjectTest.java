package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleArrayOfObjectTest {
	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[3];

		rectangles[0] = new Rectangle();
		rectangles[0].changeWidth(10);
		rectangles[0].changeHeight(5);

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		rectangles[1] = r1;
		rectangles[1].changeWidth(100);
		rectangles[1].changeHeight(50);

		rectangles[2] = r2;
		rectangles[2].changeWidth(50);
		rectangles[2].changeHeight(100);

		printInfo(rectangles);
		printInfo1(rectangles);

	}

	private static void printInfo1(Rectangle[] rectangles) {
		for (Rectangle rectangle : rectangles) {
			printInfo1(rectangle);
		}
	}

	private static void printInfo1(Rectangle rectangle) {
		System.out.printf("Width=%d \t Height=%d \t Area=%d\n", rectangle.readWidth(), rectangle.readHeight(),	rectangle.readWidth() * rectangle.readHeight());

	}

	private static void printInfo(Rectangle[] rectangles) {
		for (Rectangle rectangle : rectangles) {
			System.out.printf("Width=%d \t Height=%d \t Area=%d \t Hashcode=%d \n", rectangle.readWidth(),	rectangle.readHeight(), rectangle.readWidth() * rectangle.readHeight(), rectangle.hashCode());
		}
	}
}
