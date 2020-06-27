package com.techlabs.model;

public class Substraction extends Arithematic {
	private Calculator calculator;

	public Substraction(Calculator calculator) {
		this.calculator = calculator;
		this.calculator.addArithematic(this);
	}

	@Override
	public void update() {
		System.out.println("Subtraction is " + (calculator.getNumber1() - calculator.getNumber2()));
	}

}