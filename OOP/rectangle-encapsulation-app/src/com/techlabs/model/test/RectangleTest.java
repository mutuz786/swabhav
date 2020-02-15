package com.techlabs.model.test;

import com.techlabs.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle small = new Rectangle();
		System.out.printf("width=%d \t height=%d \n", small.readWidth(), small.readHeight());
		
		small.changeWidth(27);
		small.changeHeight(12);
		System.out.printf("width=%d \t height=%d \n", small.readWidth(), small.readHeight());

		small.changeWidth(27);
		small.changeHeight(-10000);
		System.out.printf("width=%d \t height=%d \n", small.readWidth(), small.readHeight());
		
		small.changeWidth(100000);
		small.changeHeight(12);
		System.out.printf("width=%d \t height=%d \n", small.readWidth(), small.readHeight());
	}
}
