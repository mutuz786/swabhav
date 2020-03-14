package com.techlab.practice;

public class Arithematic {
	public static double calculateAns(String que) {
		double opnd1 = findOpnd(que, 1);
		double opnd2 = findOpnd(que, -1);
		char optr = findOptr(que);
		switch (optr) {
		case '+':
			return opnd1 + opnd2;
		case '-':
			return opnd1 - opnd2;
		case '/':
			return opnd1 / opnd2;
		case '*':
			return opnd1 * opnd2;
		case '%':
			return opnd1 % opnd2;
		}
		return 0;
	}

	private static double findOpnd(String que, int i) {
		if(i==1)
			return Double.parseDouble(que.substring(0,findIndex(que)));
		if(i==-1)
			return Double.parseDouble(que.substring(findIndex(que)-i,que.length()));
		return 0;	
	}

	private static char findOptr(String que) {
		return que.charAt(findIndex(que));
	}

	private static int findIndex(String que) {
		for (int i = 0; i < que.length(); i++) {
			if (opPresent(que.charAt(i)))
				return i;
		}
		return 0;
	}

	private static boolean opPresent(char quechar) {
		char[] ops= {'+','-','/','*','%'};
		for(char op:ops) {
			if(op==quechar)
				return true;
		}
		return false;
	}

}
