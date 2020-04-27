package com.techlabs.test;

public class RuntimeExceptionStackTest {
	public static void main(String[] args) {
		try{
			m1();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");
	}

	private static void m1() {
		System.out.println("inside m1");
		m2();
	}

	private static void m2() {
		System.out.println("inside m2");
		m3();
	}

	private static void m3() {
		System.out.println("inside m3");
		throw new RuntimeException("some fatal error in m3");
	}
}
