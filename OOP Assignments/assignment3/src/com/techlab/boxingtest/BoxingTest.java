package com.techlab.boxingtest;

public class BoxingTest {
	public static void main(String [] args) {
		Integer marks=50;
		System.out.println(marks);
		float percentage=(float) (marks*0.20);
		System.out.println(percentage);
		short test1=50;
		showType(test1);
		int test2=50;
		showType(test2);
		Integer test3=(Integer)test2;
		showType(test3);
		
		int i1=1;
		int i2=1;
		System.out.println(i1==i2);
		Integer num1=1;
		int num2=1;
		System.out.println(num1==num2);
		Integer one=new Integer(1);
		Integer anotherOne=new Integer(1);
		System.out.println(one==anotherOne);
	}
	static void showType(int number){
		System.out.println("int");
	}  
	 static void showType(Integer number){
		 System.out.println("Integer");
	}  
}
