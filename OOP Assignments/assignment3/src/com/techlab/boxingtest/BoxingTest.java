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
	}
	static void showType(int number){
		System.out.println("int");
	}  
	 static void showType(Integer number){
		 System.out.println("Integer");
	}  
}
