package com.techlabs.model;

import java.lang.reflect.*;

public class AnnotationTest {
	static Class<Foo> fooClass = Foo.class;
	static Method[] methods = fooClass.getDeclaredMethods();
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int trueCases = getCaseCount(true);
		int falseCases = getCaseCount(false);
		System.out.println("Number of Testcases Present:"+(trueCases+falseCases));
		System.out.println("Passing Testcases:"+trueCases);
		System.out.println("Failing Testcases:"+falseCases);
	}

	private static int getCaseCount(boolean testCase) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int count=0;
		for (Method method : methods) {
			UnitTestCase annotation = method.getAnnotation(UnitTestCase.class);
			if (annotation != null) {
				count+=isTestCase(method,testCase);
			}
		}
		return count;
	}

	private static int isTestCase(Method method, boolean testCase) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Foo foo=new Foo();
		boolean result = false;
			result = (boolean) method.invoke(foo);
		if(result==testCase) {
			for (Method method1 : methods) {
				MyBeforeEveryUnitTestcase annotation = method1.getAnnotation(MyBeforeEveryUnitTestcase.class);
				if (annotation != null) {
					method1.invoke(foo);
				}
			}
			return 1;
		}
		return 0;
	}
}
