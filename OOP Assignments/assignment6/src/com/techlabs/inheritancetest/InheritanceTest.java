package com.techlabs.inheritancetest;

class Birds {
	void roam() {
		System.out.println("Flying");
	}

	void eat() {
		System.out.println("Eating");
	}
}

class AerialBirds extends Birds {

}

class TerrestrialBirds extends Birds {
	void roam() {
		System.out.println("Walking");
	}
}

class Emu extends TerrestrialBirds {

}

class Pigeon extends AerialBirds {

}

public class InheritanceTest {
	public static void main(String[] args) {
		Emu emu = new Emu();
		emu.eat();
		emu.roam();
		Pigeon pigeon = new Pigeon();
		pigeon.eat();
		pigeon.roam();
	}
}
