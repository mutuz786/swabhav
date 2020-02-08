package com.techlabs.basic;

public class ArgumentTest {

	public static void main(String[] names) {
		System.out.println(names.length);
		for (String name : names) {
			System.out.println(name);
		}

		for (String name : names) {
			name = name.concat(" Aurion pro");
			// System.out.println(name);
		}
		System.out.println(names[0]);

		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].concat(" Aurion pro");
			// System.out.println(names[i]);
		}
		System.out.println(names[0]);
		String[] copy = new String[names.length];
		copy = names;
		
		System.out.println(copy[0]);
		for (int i = 0; i < names.length; i++) {
			System.out.println(copy[i].hashCode() + "\t" + names[i].hashCode());
		}
		System.out.println(copy.hashCode() + "\t" + names.hashCode()+"\n");
		copy[0]=copy[0].concat(" employee");
		System.out.println(copy[0]);
		System.out.println(names[0]);

		for (int i = 0; i < names.length; i++) {
			System.out.println(copy[i].hashCode() + "\t" + names[i].hashCode());
		}
		System.out.println(copy.hashCode() + "\t" + names.hashCode());
		copy[3]="Swabhav Techlabs";
		System.out.println(copy[3]);
		System.out.println(names[3]);

	}
}