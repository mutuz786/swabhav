package com.techlab.wrappertest;

public class WrapperTest {
	public static void main(String[] args) {
		int myInt = 100;
		Integer myInteger=myInt;
	    String myString = myInteger.toString()+"234";
	    Character myChar=myString.charAt(0);
	    Double myDouble=myInt+29.45;
	    
	    System.out.printf("%d\n",myInt);
	    System.out.printf("%d\n",myInteger);
	    System.out.printf("%s\n",myString);
	    System.out.printf("%c\n",myChar);
	    System.out.printf("%f\n",myDouble);
	}
}
