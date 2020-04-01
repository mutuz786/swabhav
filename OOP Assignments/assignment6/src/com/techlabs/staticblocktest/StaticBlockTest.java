package com.techlabs.staticblocktest;

public class StaticBlockTest {
	public static void main(String[] args) {
		Circle circle=new Circle(29.45);
		System.out.println("Area:"+circle.getArea());
		System.out.println("Perimeter:"+circle.getPerimeter());
	}
}
