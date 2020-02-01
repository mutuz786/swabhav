package com.techlabs.basic;

public class StringArrayTest {
	public static void main(String[] args) {
		String[] names= {"Murtaza","pawan","pawan","tejashree","shejal","tanmay","jay","vinit","prasad"};
		String[] namesWithA = new String[9];
		String[] namesWithMax=new String[9];
		int index1=0,max=0,index2=0,maxNames=0;
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+"\t");
		}
		System.out.println("\n");
		for(String name:names) {
			System.out.print(name+"\t");
			if(name.contains("a") || name.contains("A")) {
				namesWithA[index1]=name;
				index1++;
			}
			if(max<name.length() &&) {
				namesWithMax[index2]=name;
				max=name.length();
			}
			if(max==name.length()) {
				index2++;
				namesWithMax[index2]=name;
			}
		}
		System.out.println("\n");
		for(String name:namesWithA) {
			if(name!=null)
				System.out.print(name+"\t");
		}
		System.out.println("\n");
		System.out.println(namesWithMax[0]);
		
	}
}
