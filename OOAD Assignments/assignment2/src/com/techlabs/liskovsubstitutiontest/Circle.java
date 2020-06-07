package com.techlabs.liskovsubstitutiontest;

public class Circle extends Rectangle {
	private double pi = 22 / 7;

	@Override
	public void setLength(double length) {
		this.breath = length * length;
		this.length = pi;
	}

	@Override
	public void setBreath(double breath) {
		this.breath = breath * breath;
		this.length = pi;
	}
}
