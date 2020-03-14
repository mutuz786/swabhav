package com.techlab.practice;

class Animals{
	public void roam() {
		System.out.println("Running");
	}
	public void eat() {
		System.out.println("Eating");
	}
}

interface Tamable{
	abstract void tame();
}

class Birds extends Animals{
	public void roam() {
		System.out.println("Flying");
	}
}

class Emu extends Birds{
	public void roam() {
		new Animals().roam();
	}
	public void eat() {
		System.out.println("Pecking");
	}
}

class Rooster extends Birds implements Tamable{
	public void tame() {
		System.out.println("Tamed");
	}
}

public class InheritanceTest {
	public static void main(String [] args) {
		Emu emu1=new Emu();
		emu1.roam();
		emu1.eat();
		System.out.println();
		
		Animals emu2=new Emu();
		emu2.roam();
		emu2.eat();			//The method eat() is undefined for the type Animals
		System.out.println();

		Rooster rooster1=new Rooster();
		rooster1.roam();
		rooster1.tame();
		rooster1.eat();
		System.out.println();

		Animals rooster2=new Rooster();
		rooster2.roam();
		//rooster2.tame();		//The method tame() is undefined for the type Animals
		rooster2.eat();
	}
}
