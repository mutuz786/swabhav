package com.techlab.classreflectiontest;

import java.lang.reflect.Method;
public class Demo {
	public static void main(String[] args)  {  
		try {  
			Class<?> cls = Class.forName("java.lang.String");  
			System.out.println("Class Name: " + cls.getName());  
			System.out.println("Package Name: " + cls.getPackage());  
			Method[] methods = cls.getDeclaredMethods();  
			System.out.println("-----Methods of String class -------------");  
			for (Method method : methods)   {  
				System.out.println(method.getName());  
			}  
		}  
		catch (ClassNotFoundException e)   
		{  
			e.printStackTrace();  
		}  
	}  
}
