package com.techlabs.strategypatterntest.test;

import com.techlabs.strategypatterntest.*;

public class Test {
	public static void main(String [] args ) {
		Operation operation1=new Operation(new Addition());
		Operation operation2=new Operation(new Subtraction());
		Operation operation3=new Operation(new Multiplication());
		Operation operation4=new Operation(new Division());
		
		System.out.println("5+5="+operation1.perform(5, 5));
		System.out.println("5-5="+operation2.perform(5, 5));
		System.out.println("5*5="+operation3.perform(5, 5));
		System.out.println("5/5="+operation4.perform(5, 5));
	}
}
