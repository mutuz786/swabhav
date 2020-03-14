package com.techlab.practice;

import java.util.ArrayList;

public class Test {
	static ArrayList<Double> operands = new ArrayList<Double>();
	static ArrayList<Character> operators = new ArrayList<Character>();

	public static void main(String[] args) {
		print("92/52+2213-732/53+21");
	}

	private static void print(String problem) {
		double ans = calculateAnswer(problem);
		System.out.println("Question:" + problem + "\nAnswer:" + ans);
	}

	private static double calculateAnswer(String problem) {
		getData(problem);
		performOperation();
		return operands.get(0);
	}

	private static void performOperation() {
		for(int i=0;i<operators.size();i++) {
			if(operators.get(i)=='/') {
				double quotient=operands.get(i)/operands.get(i+1);
				updateArray(quotient,i);
				
			}
		}
		for(int i=0;i<operators.size();i++) {
			if(operators.get(i)=='*') {
				double quotient=operands.get(i)*operands.get(i+1);
				updateArray(quotient,i);
				
			}
		}
		for(int i=0;i<operators.size();i++) {
			if(operators.get(i)=='+') {
				double quotient=operands.get(i)+operands.get(i+1);
				updateArray(quotient,i);
				
			}
		}
		for(int i=0;i<operators.size();i++) {
			if(operators.get(i)=='-') {
				double quotient=operands.get(i)-operands.get(i+1);
				updateArray(quotient,i);
				
			}
		}
	}

	private static void updateArray(double quotient, int index) {
		//System.out.println(operands.get(i)+" "+operators.get(i)+" "+operands.get(i+1));
		for(int i=0;i<operators.size();i++) {
			System.out.print(operands.get(i)+" ");
			System.out.print(operators.get(i)+" ");
		}
		System.out.println(operands.get(operands.size()-1));
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
				operands.add(Double.parseDouble(problem.substring(start, problem.length() - 1)));
			}
		}
	}
}
