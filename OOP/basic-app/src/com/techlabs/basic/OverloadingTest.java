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
	static void printInfo(String str)
	{
		System.out.println(str);
	}
	static void printInfo(char ch)
	{
		System.out.println(ch);
	}
	static void printInfo(float fnum)
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