package com.techlabs.closeandflushtest;

import java.util.Scanner;

public class CloseTest {
	public static void main(String [] args) {
		String text=new String();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data:");
		text=scan.nextLine();
		System.out.println("Data:"+text);
		System.out.println("Enter the data:");
		text=scan.nextLine();
		System.out.println("Data:"+text);
		scan.close();
		System.out.println("Enter the data:");
		text=scan.nextLine();
		System.out.println("Data:"+text);
		
	}
}
