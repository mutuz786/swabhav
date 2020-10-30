package com.techlabs.reflection;

import java.lang.reflect.*;

public class StringTest {
	public static void main(String[] args) {
		String s = new String();
		Class sClass = s.getClass();
		Method[] methods = sClass.getMethods();

		for (Method method : methods) {
			System.out.println(printNames(method));
		}
	}

	private static String printNames(Method method) {
		String name = method.getName();
		if (isSetters(method))
			name = name + "(Setters)";

		if (isGetters(method))
			name = name + "(Getters)";

		return name;
	}

	private static boolean isGetters(Method method) {
		return method.getName().contains("get") && method.getReturnType() != null;
	}

	private static boolean isSetters(Method method) {
		return method.getName().contains("set") && method.getReturnType() == null && method.getParameterCount() > 0;
	}
}
