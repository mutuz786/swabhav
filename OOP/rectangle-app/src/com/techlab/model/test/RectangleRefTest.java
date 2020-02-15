package com.techlab.model.test;

import com.techlab.model.*;

public class RectangleRefTest {
	public static void main(String[] args) {
		Rectangle small=null;//expects an object    violates encapsulation      assign it to null
		System.out.println(small);
		small = new Rectangle();
		System.out.println(small);
		System.out.printf("width=%d \t height=%d \t area=%d\n", small.width, small.height, small.calculateArea());
		small.width = 1000000;
		small.height = -5;
		System.out.printf("width=%d \t height=%d \t area=%d\n", small.width, small.height, small.calculateArea());
	}
}
