package com.techlabs.model;

public class Addition extends Arithematic {
	private Calculator calculator;

	public Addition(Calculator calculator) {
		this.calculator = calculator;
		this.calculator.addArithematic(this);
	}

	@Override
	public void update() {
		System.out.println("Addition is " + (calculator.getNumber1() + calculator.getNumber2()));
	}

}
