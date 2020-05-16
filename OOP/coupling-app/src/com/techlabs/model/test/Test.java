package com.techlabs.model.test;

import com.techlabs.model.A;
import com.techlabs.model.B;

public class Test {
	public static void main(String[] args) {
		A a=new A(new B());
		a.bar();
	}
}
