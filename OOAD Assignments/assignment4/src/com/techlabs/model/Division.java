package com.techlabs.model;

public class Division extends Arithematic {
	private Calculator calculator;

	public Division(Calculator calculator) {
		this.calculator = calculator;
		this.calculator.addArithematic(this);
	}

	@Override
	public void update() {
		System.out.println("Division is " + (calculator.getNumber1() / calculator.getNumber2()));
	}

}