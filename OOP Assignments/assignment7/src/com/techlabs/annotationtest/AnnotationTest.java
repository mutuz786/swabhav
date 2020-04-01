package com.techlabs.annotationtest;

import java.lang.reflect.*;
import java.text.Annotation;

public class AnnotationTest {
	public static void main(String[] args) {
		Class<? extends StudentClass> test=StudentClass.class;
		Method[] methods =test.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method.getName());
			Annotation[] annotations = (Annotation[]) method.getDeclaredAnnotations();
			for(Annotation annotation : annotations){
			    if(annotation instanceof NeedToRefactor){
			        System.out.println("name: " + method.getName());
			    }
			}	
		}
	}
}
