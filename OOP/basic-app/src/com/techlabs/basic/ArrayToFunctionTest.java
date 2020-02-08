package com.techlabs.basic;

public class ArrayToFunctionTest {
	public static void main(String[] args) {
		double[] cgpaList = { 7.5, 6.4, 5.3, 6.0 };
		for (double cgpa : cgpaList) {
			System.out.print(cgpa + "\t");
		}
		System.out.println("\n");
		upgradeCgpa(cgpaList);
		System.out.println("\n");

		for (double cgpa : cgpaList) {
			System.out.print(cgpa + "\t");
		}
	}

	static void upgradeCgpa(double[] cgpaList) {
		for (int i = 0; i < cgpaList.length; i++) {
			cgpaList[i] += (cgpaList[i] / 10);
		}
		for (double cgpa : cgpaList) {
			System.out.print(cgpa + "\t");
		}
	}

}
