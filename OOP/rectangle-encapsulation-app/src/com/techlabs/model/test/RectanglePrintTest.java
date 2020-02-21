package com.techlabs.model.test;

import com.techlabs.model.*;

public class RectanglePrintTest {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		r1.changeWidth(10);
		r1.changeHeight(5);
		r2.changeWidth(20);
		r2.changeHeight(30);

		printInfo(r1);
		printInfo(r2);

	}

	private static void printInfo(Rectangle r) {
		System.out.printf("Width=%d\tHeight=%d\tArea=%d\n", r.readWidth(), r.readHeight(),	r.readWidth() * r.readHeight());
	}
}
