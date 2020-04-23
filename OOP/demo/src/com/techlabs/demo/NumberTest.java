package com.techlabs.demo;

import java.util.ArrayList;

public class NumberTest {
	public static void main(String[] args) {
		int number=100;
		OddNumbers oddNum=new OddNumbers(number);
		System.out.println("Odd:"+printInfo(oddNum));
		EvenNumbers evenNum=new EvenNumbers(number);
		System.out.println("Even:"+printInfo(evenNum));
		
	}

	private static ArrayList<Integer> printInfo(Numbers Number) {
		return Number.getNumber();
	}

}
