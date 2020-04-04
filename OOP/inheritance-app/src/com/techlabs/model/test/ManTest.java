package com.techlabs.model.test;

import com.techlabs.model.*;

public class ManTest {
	public static void main(String [] args) {
		case1();
		case2();
		case3();
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
}
