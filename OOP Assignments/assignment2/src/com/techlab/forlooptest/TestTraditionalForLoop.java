package com.techlab.forlooptest;

public class TestTraditionalForLoop {
	public static void main(String[] args) {
		int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int temp, index;
		System.out.println("Array Before Reverse:");
		for (int i = 0; i < numArray.length; i++)
			System.out.print(numArray[i] + "\t");
		for (int i = 0; i < (numArray.length / 2); i++) {
			index = (numArray.length - 1) - i;
			temp = numArray[i];
			numArray[i] = numArray[index];
			numArray[index] = temp;
		}
		System.out.println("\nArray After Reverse:");
		for (int i = 0; i < numArray.length; i++)
			System.out.print(numArray[i] + "\t");

	}
}
