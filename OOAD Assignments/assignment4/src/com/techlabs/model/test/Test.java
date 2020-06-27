package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		new Addition(calculator);
		new Substraction(calculator);
		new Multiplication(calculator);
		new Division(calculator);

		System.out.println("First Update");
		calculator.update(80, 40);
		System.out.println("\nSecond Update");
		calculator.update(40, 40);
	}

}
