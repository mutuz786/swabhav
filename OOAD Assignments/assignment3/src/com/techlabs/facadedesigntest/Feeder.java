package com.techlabs.facadedesigntest;

public class Feeder {
	private Animal cat;
	private Animal dog;
	private Animal cow;
	private Animal pig;
	
	public Feeder() {
		cat=new Cat();
		dog=new Dog();
		cow=new Cow();
		pig=new Pig();
	}
	
	public void feedCat() {
		cat.feed();
	}
	
	public void feedDog() {
		dog.feed();
	}
	
	public void feedCow() {
		cow.feed();
	}
	
	public void feedPig() {
		pig.feed();
	}
}
