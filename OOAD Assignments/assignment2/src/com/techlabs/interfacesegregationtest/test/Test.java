package com.techlabs.interfacesegregationtest.test;

import com.techlabs.interfacesegregationtest.Dog;

public class Test {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		dog.bark();
		dog.sleep();
		dog.tame();
	}
}
