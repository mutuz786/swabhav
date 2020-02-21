package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleAnonymousTest {
	public static void main(String[] args) {
		System.out.println(new Rectangle().readWidth() + " " + new Rectangle().readHeight());
		System.out.println(new Rectangle().hashCode() + " " + new Rectangle().hashCode());
		new Rectangle().changeWidth(10);
		new Rectangle().changeHeight(5);
		printInfo(new Rectangle());
	}

	private static void printInfo(Rectangle r) {
		r.changeWidth(10);
		r.changeHeight(5);
		System.out.printf("Width=%d \t Height=%d \t Area=%d\n", r.readWidth(), r.readHeight(),	r.readWidth() * r.readHeight());
	}
}
