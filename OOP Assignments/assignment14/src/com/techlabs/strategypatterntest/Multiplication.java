package com.techlabs.strategypatterntest;

public class Multiplication implements IArithematic {

	@Override
	public double doOperation(int num1, int num2) {
		return num1 * num2;
	}

}
