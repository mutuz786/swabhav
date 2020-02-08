package com.techlabs.basic;

public class ArgumentSumAndAverageTest {

	public static void main(String[] input) {
		boolean isAcceptable = checkInput(input);
		if (isAcceptable) {
			int condition = isConditionPresent(input);
			int sum = 0, limit = 0;
			for (int i = 0; i < input.length - 1; i++) {
				if (condition < 3) {
					if ((Integer.parseInt(input[i])) % 2 == condition) {
						sum += Integer.parseInt(input[i]);
						limit++;
						System.out.print(Integer.parseInt(input[i]) + "\t");
					}
				} 
				else if(isPrime(Integer.parseInt(input[i]))) {
					
				}
				else {
					sum += Integer.parseInt(input[i]);
					System.out.print(Integer.parseInt(input[i]) + "\t");
				}
			}

			if (condition == 3) {
				limit = input.length;
				sum += Integer.parseInt(input[input.length - 1]);
			}
			System.out.println("\nSum:" + sum);
			System.out.println("Average:" + (float) (sum / limit));

		}
	}

	private static boolean isPrime(int input) {
		for(int i=0;i<input-1;i++) {
			
			
		}
		return false;
	}

	private static int isConditionPresent(String[] input) {
		if (input[input.length - 1].contains("-even")) {
			return 0;
		} 
		else if (input[input.length - 1].contains("-odd")) {
			return 1;
		}
		return 3;

	}

	public static boolean checkInput(String[] input) {
		if (input.length == 0) {
			System.out.println("No arguments");
			return false;
		}
		return true;
	}
}