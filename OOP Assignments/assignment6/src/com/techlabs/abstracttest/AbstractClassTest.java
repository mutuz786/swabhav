package com.techlabs.abstracttest;


abstract class Animal{
	void eat() {
		System.out.println("Eating");
	}
	void roam() {
		System.out.println("Running");
	}
}
class Cat extends Animal{
	
}

class Dog extends Animal{
	
}

public class AbstractClassTest {
	public static void main(String [] args) {
		Cat cat=new Cat();
		cat.roam();
		cat.eat();
		Dog dog=new Dog();
		dog.roam();
		dog.eat();
	}
}
