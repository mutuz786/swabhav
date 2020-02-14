package com.techlab.reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;
import java.lang.reflect.*;

public class TestReflection {
	public static void main(String[] args) throws ReflectiveOperationException, SecurityException {
		TestCase object = new TestCase();
		Class test = object.getClass();
		System.out.println("Class Name:" + test.getName());
		
		Constructor[] constructors = test.getConstructors();
		System.out.println("Constructor Name:");
		for (Constructor constructor : constructors)
			System.out.print(constructor.getName() + "\t");
		
		Method[] methods = test.getMethods();
		System.out.println("\nMethod Name");
		for (Method method : methods) {
			if (isGet(method))
				System.out.print(method.getName() + "(Getter Method)\t");
			else if (isSet(method))
				System.out.print(method.getName() + "(setter Method)\t");
			else
				System.out.print(method.getName() + "\t");

		}
		
		System.out.println("\nMethods working:");
		Method methodCall1 = test.getDeclaredMethod("displayName");
		methodCall1.invoke(object);
		
		java.lang.reflect.Field field = test.getDeclaredField("name");
		field.setAccessible(true);
		field.set(object, "Pawan");
		methodCall1.invoke(object);
		
		Method methodCall2 = test.getDeclaredMethod("displaySquare", int.class);
		methodCall2.setAccessible(true);
		methodCall2.invoke(object, 5);

	}

	private static boolean isSet(Method method) {
		if (!(method.getName()).startsWith("set"))
			return false;
		if (method.getParameterTypes().length != 1)
			return false;
		return true;
	}

	private static boolean isGet(Method method) {
		if (!(method.getName()).startsWith("get"))
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		return true;
	}
}

class TestCase {
	private String name = "murtaza";

	public TestCase() {

	}

	public TestCase(String arg) {
		this.name = arg;
	}

	public void displayName() {
		System.out.println("Name:" + name);
	}

	private void displaySquare(int number) {
		System.out.println("Square is:" + (number * number));
	}

	public String getName() {
		return this.name;
	}

	public void setName(String arg) {
		this.name = arg;
	}
}
