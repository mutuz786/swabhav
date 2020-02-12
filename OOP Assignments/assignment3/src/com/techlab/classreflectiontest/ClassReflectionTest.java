package com.techlab.classreflectiontest;

import java.io.File;
import java.util.Scanner;
//import java.lang.reflect.*;
//import java.lang.*;

public class ClassReflectionTest {
	public static void main(String [] args) throws ClassNotFoundException {
		System.out.println("Enter the address:");
		Scanner scan=new Scanner(System.in);
		String classDirectory=scan.nextLine();
		classDirectory=createDirectory(classDirectory);
		//Class<? extends Class> start=(Class<? extends Class>) Class.forName("ClassReflectionTest");
		//ClassLoader loader=start.getClassLoader();
		//Class<? extends Class> object=(Class<? extends Class>) Class.forName(classDirectory, false, loader);
		//Class<? extends Class> test=object.getClass();
		//System.out.println("Class Name:"+ test.getName());
	}

		public static String createDirectory(String classDirectory) {
			String[] splitDirectory=new String[3];
			splitDirectory=classDirectory.split(".");
			String buffer=null;
			for(int i=0;i<2;i++) {
				splitDirectory[i]=splitDirectory[i].toLowerCase();
				buffer=buffer.concat(splitDirectory[i]);
				System.out.println(buffer);
			}
			classDirectory=buffer.concat(splitDirectory[splitDirectory.length-1]);
			//classDirectory=classDirectory.replace('.', '\\');
			//classDirectory="C:\\Program Files\\Java\\jdk1.8.0_181\\src\\".concat(classDirectory);
			//classDirectory=classDirectory.concat(".class");
			System.out.println(classDirectory);
			return classDirectory;
		}
}
//           java.lang.String