package com.techlab.model.test;

import com.techlab.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle small = new Rectangle();
		small.width = 10;
		small.height = 5;
		System.out.print("Width=" + small.width + "\t");
		System.out.println("Height=" + small.height);
		System.out.println("Area Of Small Rectangle=" + small.calculateArea() + "\n");

		Rectangle big = new Rectangle();
		big.width = 100;
		big.height = 50;
		System.out.print("Width=" + big.width + "\t");
		System.out.println("Height=" + big.height);
		System.out.println("Area Of Big Rectangle=" + big.calculateArea());
	}
}