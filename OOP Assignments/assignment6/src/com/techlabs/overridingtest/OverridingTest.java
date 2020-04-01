package com.techlabs.overridingtest;

public class OverridingTest {
	public static void main(String[] args) {
		String name = "murtaza";
		int number = 200;
		double dnumber = 56.876;
		float fnumber = 78.45f;
		printinfo(name);
		printinfo(number);
		printinfo(fnumber);
		printinfo(dnumber);
	}

	private static void printinfo(double dnumber) {
		System.out.println(dnumber);
	}

	private static void printinfo(float fnumber) {
		System.out.println(fnumber);
	}

	private static void printinfo(String name) {
		System.out.println(name);
	}

	private static void printinfo(int number) {
		System.out.println(number);
	}
}
