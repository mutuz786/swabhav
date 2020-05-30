package com.techlabs.facadedesigntest;

public class Dog implements Animal {

	@Override
	public void feed() {
		System.out.println("Dog has Eaten");
	}
}