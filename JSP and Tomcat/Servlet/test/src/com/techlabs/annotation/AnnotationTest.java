package com.techlabs.annotation;

import java.lang.reflect.*;

public class AnnotationTest {
	public static void main(String[] args) {
		Demo demo = new Demo();
		Class demoClass = demo.getClass();
		Method[] methods = demoClass.getMethods();
		System.out.println("foloowing methhod has annotation above them:");
		for (Method method : methods) {
			demoAnnotation annotation = method.getAnnotation(demoAnnotation.class);
			if (annotation != null) {
				System.out.println(method.getName());
			}
		}

	}
}
