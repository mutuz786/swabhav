package com.techlabs.basic;

public class WelcomeTest {
	
	public static void main(String[] args) {
		System.err.println("Hello");
		System.err.println(false);
		System.err.println("fbi");
		System.err.println(12342.3232);
		System.err.println(5.6f);
		
		printinfo("Hello");
		printinfo(10.5);
		printinfo(10.5f);
		printinfo(true);
		printinfo('g');
	}
	static void printinfo(String str)
	{
		System.out.println(str);
	}
	static void printinfo(char ch)
	{
		System.out.println(ch);
	}
	static void printinfo(float fnum)
	{
		System.out.println(fnum);
	}
	static void printinfo(double dnum)
	{
		System.out.println(dnum);
	}
	static void printinfo(boolean is)
	{
		System.out.println(is);
	}
}