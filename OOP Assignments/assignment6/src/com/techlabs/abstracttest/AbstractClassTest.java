package com.techlabs.abstracttest;

abstract class ScientificName extends Animal{
	abstract void scientificName();
}

class Animal{
	void eat() {
		System.out.println("Eating");
	}
	void roam() {
		System.out.println("Running");
	}
}
class omnivore extends ScientificName{

	@Override
	void scientificName() {
		System.out.println("");
	}
	
}

public class AbstractClassTest {

}
