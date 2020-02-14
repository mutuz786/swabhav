package com.techlab.drytest;

import java.util.Scanner;

public class TestDry {
	static String[] names = new String[4];
	static int[] marks = new int[4];
	static float[] percentage = new float[4];

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Student Name:");
			names[i] = scan.nextLine();

			while (true) {
				System.out.print("Total Marks(out of 500):");
				int proxyCheck = scan.nextInt();
				if (proxyCheck > 0 && proxyCheck <= 500) {
					marks[i] = proxyCheck;
					break;
				} else
					System.out.println("Enter correct Info");
			}

			percentage[i] = (float) (marks[i] * 0.20);
			System.out.print("Percentage:" + percentage[i] + "\n");
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Name:" + names[i]);
			System.out.println("Marks:" + marks[i] + "/500");
			System.out.println("Percentage" + percentage[i]);
		}

	}
}
