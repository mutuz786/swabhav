package com.techlabs.interfacesegregationtest;

public class Dog implements Tamable, Canine {

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}

	@Override
	public void tame() {
		System.out.println("dog is tamed");
	}

	@Override
	public void bark() {
		System.out.println("dog is barking");
	}

}
