package assignment8com.techlabs.customannotationtest;

public class Foo {
	
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
