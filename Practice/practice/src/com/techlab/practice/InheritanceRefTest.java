package com.techlab.practice;

class A{
	int i;
	public void display() {
		System.out.println(i);
	}
}

class B extends A{
	int j;
	public void display() {
		System.out.println(j);
	}
}

public class InheritanceRefTest {
	public static void main(String[] args) {
		A obj=new B();
		B r;
		r= (B) obj;
		r.i=30;
		r.j=25;
		obj.display();
	}
}
