package com.techlab.classreflectiontest;

import java.util.Scanner;
import java.lang.reflect.*;

public class ClassReflectionTest {
	private static Scanner scan;
	public static void main(String [] args) throws ClassNotFoundException {
		System.out.println("Enter the address:");
		String classDirectory=getDirectory();
		try   {  
			Class<?> classObject = Class.forName(classDirectory);  
			System.out.println("Class Name:" + classObject.getName()); 
			Constructor[] constructors=classObject.getConstructors();
			
			Method[] methods = classObject.getDeclaredMethods();  
			System.out.println("Methods of String class:");  
			for (Method method : methods) {
				if (isGet(method))
					System.out.println(method.getName() + "(Getter Method)");
				else if (isSet(method))
					System.out.println(method.getName() + "(setter Method)");
				else
					System.out.println(method.getName());

			}  
		}  
		catch (ClassNotFoundException e)   {  
			e.printStackTrace();  
		}
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
		if (method.getReturnType()== null)
			return false;
		return true;
	}

	private static String getDirectory() {
		scan = new Scanner(System.in);
		String classDirectory=scan.nextLine();
		return getValidDirectory(classDirectory);
	}

	private static String getValidDirectory(String classDirectory) {
		System.out.println("Enter the data:");
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println(classDirectory);
			classDirectory=classDirectory.replace(".", " ");
			System.out.println(classDirectory);
			String [] directoryArray=classDirectory.split("\\s");
			classDirectory="";
			for(int i=0;i<directoryArray.length-1;i++) {
				directoryArray[i]=directoryArray[i].toLowerCase();
				classDirectory=classDirectory+(directoryArray[i]);
				classDirectory=classDirectory.concat(".");
			}
			classDirectory=classDirectory+directoryArray[directoryArray.length-1];
			System.out.println(classDirectory);
		}
		return classDirectory;
	}
}
