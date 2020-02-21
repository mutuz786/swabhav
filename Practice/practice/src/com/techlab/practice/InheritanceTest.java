package com.techlab.practice;

class Animals{
	public void roam() {
		System.out.println("Running");
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
		super.roam();
	}
	public void eat() {
		System.out.println("Eating");
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
		Animals emu2=new Emu();
		emu2.roam();
		//emu2.eat();			//The method eat() is undefined for the type Animals
		Rooster rooster1=new Rooster();
		rooster1.roam();
		rooster1.tame();
		Animals rooster2=new Rooster();
		rooster2.roam();
		//rooster2.tame();		//The method tame() is undefined for the type Animals
	}
}
