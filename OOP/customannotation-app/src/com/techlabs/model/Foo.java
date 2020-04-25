package com.techlabs.model;

public class Foo {

	@MyBeforeEveryUnitTestcase 
	public void bar() {
		System.out.println("before called");
	}

	@UnitTestCase
	public Boolean m1() {
		return true;
	}

	public Boolean m2() {
		return true;
	}

	@UnitTestCase
	public Boolean m3() {
		return false;
	}

	@UnitTestCase
	public Boolean m4() {
		return true;
	}
}
