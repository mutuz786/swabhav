package com.techlabs.annotationtest;

import java.lang.reflect.*;
public class AnnotationTest {
	public static void main(String[] args) {
		Class<? extends StudentClass> test=StudentClass.class;
		Method[] methods =test.getMethods();
		System.out.println("Methods That Need To Refactor");
		for(Method method:methods) {
			getAnnotedMethods(method,NeedToRefactor.class);
		}
	}

	private static void getAnnotedMethods(Method method, Class<NeedToRefactor> classname) {
		NeedToRefactor annotation=method.getAnnotation(NeedToRefactor.class);
		if(annotation!=null)
			System.out.println(method.getName());
	}
}