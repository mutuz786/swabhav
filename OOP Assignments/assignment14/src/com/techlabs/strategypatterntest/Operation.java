package com.techlabs.strategypatterntest;

public class Operation {
	private IArithematic iArithematic;

	public Operation(IArithematic iArithematic) {
		this.iArithematic = iArithematic;
	}

	public double perform(int num1, int num2) {
		return iArithematic.doOperation(num1, num2);
	}
}
