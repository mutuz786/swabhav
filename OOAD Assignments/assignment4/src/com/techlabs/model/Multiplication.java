package com.techlabs.model;

public class Multiplication extends Arithematic {
	private Calculator calculator;

	public Multiplication(Calculator calculator) {
		this.calculator = calculator;
		this.calculator.addArithematic(this);
	}

	@Override
	public void update() {
		System.out.println("Multiplication is " + (calculator.getNumber1() * calculator.getNumber2()));
	}

}