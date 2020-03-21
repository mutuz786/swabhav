package com.techlab.practice;

import java.util.ArrayList;

public class Calculate {
	
	public static void main(String[] args) {
		Double ans=calculateAnswer("20/(5+5)-1");
		System.out.println(ans);
	}
	
	public static Double calculateAnswer(String problem) {
		ArrayList<Double> operands = new ArrayList<Double>();
		ArrayList<Character> operators = new ArrayList<Character>();
		getData(problem,operands,operators);
		performOperation(operands,operators);
		Double answer=operands.get(0);
		operands.removeAll(operands);
		operators.removeAll(operators);
		return answer;
	}

	private static void performOperation(ArrayList<Double> operands, ArrayList<Character> operators) {
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i) == '/') {
				double quotient = operands.get(i) / operands.get(i + 1);
				updateArray(quotient, i,operands,operators);
				i--;
			}
		}
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i) == '*') {
				double quotient = operands.get(i) * operands.get(i + 1);
				updateArray(quotient, i,operands,operators);
				i--;
			}
		}
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i) == '+') {
				double quotient = operands.get(i) + operands.get(i + 1);
				updateArray(quotient, i,operands,operators);
				i--;
			}
		}
		for (int i = 0; i < operators.size(); i++) {
			if (operators.get(i) == '-') {
				double quotient = operands.get(i) - operands.get(i + 1);
				updateArray(quotient, i,operands,operators);
				i--;
			}
		}
	}

	private static void updateArray(double quotient, int index, ArrayList<Double> operands, ArrayList<Character> operators) {
		operands.remove(index);
		operands.remove(index);
		operators.remove(index);
		operands.add(index, quotient);
	}

	private static void getData(String problem, ArrayList<Double> operands, ArrayList<Character> operators) {
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
			if(problem.charAt(i)=='(') {
				operands.add(inBracket(i,problem));
				i=newLocation(i,problem);
				operators.add(problem.charAt(i));
				start=i+1;
				
			}
		}
	}

	private static int newLocation(int i, String problem) {
		for(int j=i;j<problem.length();j++) {
			if(problem.charAt(j)==')') {
				return j+1;
			}
		}
		return 0;
	}

	private static Double inBracket(int i, String problem) {
		for(int j=i;j<problem.length();j++) {
			if(problem.charAt(j)==')') {
				return calculateAnswer(problem.substring(i+1, j));
			}
		}
		return null;
	}
}
