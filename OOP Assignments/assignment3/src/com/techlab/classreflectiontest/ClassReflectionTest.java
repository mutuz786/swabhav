package com.techlab.classreflectiontest;

import java.util.Scanner;
import java.lang.reflect.*;
//import java.lang.*;

public class ClassReflectionTest {
	private static Scanner scan;
	public static void main(String [] args) throws ClassNotFoundException {
		System.out.println("Enter the address:");
		String classDirectory=getDirectory();
		try   {  
			Class<?> cls = Class.forName(classDirectory);  
			System.out.println("Class Name: " + cls.getName());  
			System.out.println("Package Name: " + cls.getPackage());  
			Method[] methods = cls.getDeclaredMethods();  
			System.out.println("-----Methods of String class -------------");  
			for (Method method : methods)   
			{  
				System.out.println(method.getName());  
			}  
		}  
		catch (ClassNotFoundException e)   {  
			e.printStackTrace();  
		}
	}

	private static String getDirectory() {
		scan = new Scanner(System.in);
		String classDirectory=scan.nextLine();
		//return getValidDirectory(classDirectory);
		return classDirectory;
	}

	private static String getValidDirectory(String classDirectory) {
		String[] splitDirectory;
		splitDirectory=classDirectory.split(".");
		String buffer=null;
		for(int i=0;i<2;i++) {
			splitDirectory[i]=splitDirectory[i].toLowerCase();
			buffer=buffer.concat(splitDirectory[i]);
			System.out.println(buffer);
		}
		classDirectory=buffer.concat(splitDirectory[splitDirectory.length-1]);
		System.out.println(classDirectory);
		return classDirectory;
	}
}
//           java.lang.String