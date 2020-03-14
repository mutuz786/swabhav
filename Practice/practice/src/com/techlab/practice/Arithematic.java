package com.techlab.practice;

public class Arithematic {
	public static double calculateAns(String problem) {
		double operand1 = findOperand(problem, 1);
		double operand2 = findOperand(problem, -1);
		char operator = findOperator(problem);
		switch (operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '/':
			return operand1 / operand2;
		case '*':
			return operand1 * operand2;
		case '%':
			return operand1 % operand2;
		}
		return 0;
	}

	private static double findOperand(String problem, int choice) {
		if (choice == 1)
			return Double.parseDouble(problem.substring(0, findIndex(problem)));
		if (choice == -1)
			return Double.parseDouble(problem.substring(findIndex(problem) - choice, problem.length()));
		return 0;
	}

	private static char findOperator(String problem) {
		return problem.charAt(findIndex(problem));
	}

	private static int findIndex(String problem) {
		for (int i = 0; i < problem.length(); i++) {
			if (isOpPresent(problem.charAt(i)))
				return i;
		}
		return 0;
	}

	public static boolean isOpPresent(char character) {
		char[] ops = { '+', '-', '/', '*', '%' };
		for (char op : ops) {
			if (op == character)
				return true;
		}
		return false;
	}

}
