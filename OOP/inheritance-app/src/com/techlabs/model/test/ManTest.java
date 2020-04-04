package com.techlabs.model.test;

import com.techlabs.model.*;

public class ManTest {
	public static void main(String [] args) {
		//case1();
		//case2();
		//case3();
		case4();
	}

	private static void atThePark(Man x) {
		System.out.println("at the park");
		x.play();
	}

	private static void case1() {
		Man x=new Man();
		x.play();
		x.read();
		x.walk();
	}
	
	private static void case2() {
		Boy y=new Boy();
		y.play();
		y.eat();
		y.read();
		y.walk();
	}

	private static void case3() {
		Man y=new Boy();
		y.play();
		y.read();
		y.walk();
	}

	private static void case4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}


}
