package com.techlabs.liskovsubstitutiontest;

public class Square extends Rectangle {
	@Override
	public void setLength(double length) {
		this.breath = length;
		this.length = length;
	}

	@Override
	public void setBreath(double breath) {
		this.breath = breath;
		this.length = breath;
	}

}
