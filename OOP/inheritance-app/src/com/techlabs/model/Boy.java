package com.techlabs.model;

public class Boy extends Man{
	@Override
	public void play() {
		System.out.println("Boy is playing");
	}
	
	public void eat() {
		System.out.println("Boy is eating");
	}
	
	public void run() {
		System.out.println("Boy is running");
	}
}
