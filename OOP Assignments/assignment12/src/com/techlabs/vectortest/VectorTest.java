package com.techlabs.vectortest;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>(10);
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		vector.add(10);
		vector.addElement(51);
		vector.add(1, 15);
		arrayList.add(56);
		arrayList.add(42);
		vector.addAll(arrayList);
		System.out.println(vector);
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		vector.setSize(23);
		System.out.println(vector.capacity());
		System.out.println(vector.size());
	}
}
