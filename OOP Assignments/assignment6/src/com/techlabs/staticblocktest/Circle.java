package com.techlabs.staticblocktest;

public class Circle {
	static double pi;
	double radius=0;
	static {
		pi=22/7;
	}
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		return pi*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*pi*radius;
	}
	
}
