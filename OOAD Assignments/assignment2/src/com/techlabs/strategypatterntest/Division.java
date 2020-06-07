package com.techlabs.strategypatterntest;

public class Division implements IArithematic {

	@Override
	public double doOperation(int num1, int num2) {
		return num1 / num2;
	}

}
