package com.techlab.circle.test;

import com.techlab.circle.Circle;
import java.lang.reflect.*;

public class CircleTest2 {
	public static void main(String[] args) {
		Circle[] circles = new Circle[5];
		// System.out.println(circles[0]);
		circles[0] = new Circle();
		displayMethods(Circle.class);
		System.out.println();
		displayMethods(Integer.class);
		System.out.println();
		displayMethods(CircleTest2.class);
		System.out.println(new Circle().calculateArea());
	}

	private static void displayMethods(Class<? extends Object> class1) {
		Method[] methods = class1.getDeclaredMethods();
		for (Method method : methods) {
			displayMethod(method);
		}
		System.out.println(methods.length + " Methods");
	}

	private static void displayMethod(Method method) {
		System.out.println(method.getName());		
	}
}
