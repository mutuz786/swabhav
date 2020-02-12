package com.techlab.calisthenicstest;

import java.util.Scanner;

public class ObjectCalisthenicsTest {
	public static String[] name = new String[5];
	public static int[] marks = new int[5];
	public static double[] percentage = new double[5];

	public static void main(String[] args) {
		System.out.println("Enter The Data");
		inquire();
		displayData();
	}

	private static void displayData() {
		for(int i=0;i<5;i++) {
			System.out.println("Name"+name[i]);
			System.out.println("Percentage"+percentage[i]);
		}
	}

	private static void inquire() {
		for (int i = 0; i < 5; i++) {
			setName(i);
			setMarks(i);
			calculatePercentage();
		}
	}

	private static void calculatePercentage() {
		for (int i = 0; i < 5; i++) {
			percentage[i] = marks[i] * 0.2;
		}
	}

	private static void setName(int i) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Name:");
		name[i] = scan.nextLine();
	}

	private static void setMarks(int i) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Marks(out of 500)");
		marks[i] = scan.nextInt();
		if (marks[i] < 0 || marks[i] > 500) {
			System.out.println("Enter Correct Data");
			setMarks(i);
		}
	}
}
