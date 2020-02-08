package com.techlabs.basic;

public class OverloadingTest {
	
	public static void main(String[] args) 
	{
		
		System.err.println("Hello");
		System.err.println(false);
		System.err.println("fbi");
		System.err.println(12342.3232);
		System.err.println(5.6f);
		
		printInfo("Hello");
		printInfo(10.5);
		printInfo(10.5f);
		printInfo(true);
		printInfo('g');
		
	}
	private static void printInfo(String str)
	{
		System.out.println(str);
	}
	private static void printInfo(char ch)
	{
		System.out.println(ch);
	}
	private static void printInfo(float fnum)
	{
		System.out.println(fnum);
	}
	static void printInfo(double dnum)
	{
		System.out.println(dnum);
	}
	static void printInfo(boolean is)
	{
		System.out.println(is);
	}
}