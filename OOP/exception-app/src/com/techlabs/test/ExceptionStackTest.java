package com.techlabs.test;

public class ExceptionStackTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of main");
	}

	private static void m1() throws Exception {
		System.out.println("inside m1");
		m2();
	}

	private static void m2() throws Exception {
		System.out.println("inside m2");
		m3();
	}

	private static void m3() throws Exception {
		System.out.println("inside m3");
		throw new Exception("some fatal error in m3");
	}
}
