package com.techlabs.annotationtest;

import java.lang.reflect.*;
import java.text.Annotation;

public class AnnotationTest {
	public static void main(String[] args) {
		Class<? extends StudentClass> test=StudentClass.class;
		Method[] methods =test.getDeclaredMethods();
		Annotation[] annotations = (Annotation[]) test.getAnnotations();
		for (int i = 0; i < annotations.length; i++) {
			Annotation annotation = annotations[i];
			System.out.println("name");
		}
		
	}
}


/*
for(Method method:methods) {
System.out.println(method.getName());
Annotation[] annotations = (Annotation[]) method.getDeclaredAnnotations();
for(Annotation annotation : annotations){
    if(annotation == NeedToRefactor){
        System.out.println("name: ");
    }
}	
} */