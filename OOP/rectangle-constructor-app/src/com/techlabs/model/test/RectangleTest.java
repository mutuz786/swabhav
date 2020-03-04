package com.techlabs.model.test;

import com.techlabs.model.*;

public class RectangleTest {
	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle(-10, 5, ColorType.GREEN);
		displayInfo(rect1);

		Rectangle rect2 = new Rectangle(-5, -2);
		displayInfo(rect2);

		Rectangle rect3 = new Rectangle(0, 0, ColorType.BLUE);
		displayInfo(rect3);

		Rectangle rect4 = new Rectangle(10, 2, ColorType.RED);
		displayInfo(rect4);

		Rectangle rect5 = new Rectangle(10, 20, null);
		displayInfo(rect5);

	}

	private static void displayInfo(Rectangle rect) {
		System.out.printf("Width=%d \t Height=%d \t Color=%s \t area=%d \n", rect.getWidth(), rect.getHeight(),
				rect.getColor(), rect.calculateArea());
	}

}
