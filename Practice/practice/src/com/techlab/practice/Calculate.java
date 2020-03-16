package com.techlab.practice;

import java.util.ArrayList;

public class Calculate {
	static ArrayList<Double> operands = new ArrayList<Double>();
	static ArrayList<Character> operators = new ArrayList<Character>();
	
	public static void main(String[] args) {
		Double ans=calculateAnswer("20-5-5-5");
		System.out.println(ans);
	}
	
	public static double calculateAnswer(String problem) {
		getData(problem);
		performOperation();
		Double answer=operands.get(0);
		operands.removeAll(operands);
		operators.removeAll(operators);
		return answer;
	}

	private static void performOperation() {
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i) == '/') {
				double quotient = operands.get(i) / operands.get(i + 1);
				updateArray(quotient, i);
				i--;
			}
		}
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i) == '*') {
				double quotient = operands.get(i) * operands.get(i + 1);
				updateArray(quotient, i);
				i--;
			}
		}
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i) == '+') {
				double quotient = operands.get(i) + operands.get(i + 1);
				updateArray(quotient, i);
				i--;
			}
		}
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i) == '-') {
				double quotient = operands.get(i) - operands.get(i + 1);
				updateArray(quotient, i);
				i--;
			}
		}
	}

	private static void updateArray(double quotient, int index) {
		operands.remove(index);
		operands.remove(index);
		operators.remove(index);
		operands.add(index, quotient);
	}

	private static void getData(String problem) {
		int start = 0;
		for (int i = 0; i < problem.length(); i++) {
			if (Arithematic.isOpPresent(problem.charAt(i))) {
				operands.add(Double.parseDouble(problem.substring(start, i)));
				operators.add(problem.charAt(i));
				start = i + 1;
			}
			if (i == problem.length() - 1) {
				operands.add(Double.parseDouble(problem.substring(start, problem.length())));
			}
		}
	}
}
