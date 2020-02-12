package com.techlab.gettersandsettertest;

import java.util.Scanner;

public class GetterAndSetterTest {
	public static int acTemperature = 25;

	public static void main(String[] args) {
		System.out.println("Temp:" + acTemperature);
		System.out.println("1.Hot...............10.Cold\nEnter The Room Atmosphere:");
		int choice = getChoice();
		if (choice != -1)
			autoAdjust(choice);
		System.out.println("Temp:" + acTemperature);
	}

	private static void autoAdjust(int choice) {
		int adjustments = 0;
		adjustments = 5 - choice;
		setAdjustments(adjustments);
	}

	private static void setAdjustments(int adjustments) {
		acTemperature -= adjustments;
	}

	private static int getChoice() {
		try (Scanner scan = new Scanner(System.in)) {
			int choice = scan.nextInt();
			boolean isAcceptable = checkChoice(choice);
			// System.out.println(isAcceptable);
			if (isAcceptable)
				return choice;
			choice = -1;
			return choice;
		}

	}

	private static boolean checkChoice(int choice) {
		if (choice > 10 || choice < 1) {
			System.out.println("Enter correct details");
			return false;
		}
		return true;
	}
}
