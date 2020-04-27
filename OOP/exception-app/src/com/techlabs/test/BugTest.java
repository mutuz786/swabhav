package com.techlabs.test;

public class BugTest {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println(c);
			System.out.println("End of the main");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("enter two element");
		} catch (NumberFormatException e) {
			System.out.println("please enter number as input");
		} catch (ArithmeticException e) {
			System.out.println("dont enter 0 as a denominator");
		}
		try {
			main(args);
		} catch (StackOverflowError e) {
			return;
		}
	}
}
