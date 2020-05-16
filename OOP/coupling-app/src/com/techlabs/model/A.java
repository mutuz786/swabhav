package com.techlabs.model;

public class A {
	private InterfaceA interfaceA;

	public A(InterfaceA interfaceA) {
		this.interfaceA = interfaceA;
	}

	public void bar() {
		System.out.println("bar method");
		interfaceA.foo();
	}
}
