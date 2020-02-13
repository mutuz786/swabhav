package com.techlab.classreflectiontest;

//import java.util.Scanner;
public class Demo2 {
	public static void main(String[]  args) {
//		System.out.println("Enter the data:");
//		try (Scanner scan = new Scanner(System.in)) {
			String link="java.lang.string";			//scan.nextLine();
			System.out.println(link);
			String[] linkArray=link.split(".",5);
			for(int i=0;i<linkArray.length;i++) {
				System.out.println(linkArray[i]);
			}
//		}
	}
}
