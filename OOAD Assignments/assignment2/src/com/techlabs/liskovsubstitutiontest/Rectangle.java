package com.techlabs.liskovsubstitutiontest;

public class Rectangle {
	protected double length;
	protected double breath;

	public double calculateArea() {
		return length * breath;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}

}
