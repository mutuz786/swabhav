package com.techlabs.facadedesigntest;

public class Cow implements Animal {

	@Override
	public void feed() {
		System.out.println("Cow has Eaten");
	}
}