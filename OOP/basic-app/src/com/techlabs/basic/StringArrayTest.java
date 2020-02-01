package com.techlabs.basic;

public class StringArrayTest {
	public static void main(String[] args) {
		String[] names = { "Murtazatt", "pawan", "pawan", "tejashree", "shejal", "tanmay", "jay", "vinit", "prasad" };
		String[] namesWithA = new String[9];
		String[] namesWithMax = new String[9];
		int index1 = 0, max = 0, index2 = 0, maxNames = 0;
		System.out.print("Using For Loop:\n");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
		System.out.print("\nUsing Enhanced For Loop:\n");
		for (String name : names) {
			System.out.print(name + "\t");
			if (name.contains("a") || name.contains("A")) {
				namesWithA[index1] = name;
				index1++;
			}
			if (name.length() > max && maxNames == 0) {
				namesWithMax[index2] = name;
				max = name.length();

			} else if (name.length() > max && maxNames != 0) {
				index2 = 0;
				namesWithMax[index2] = name;
				max = name.length();

			} else if (name.length() == max) {
				index2++;
				namesWithMax[index2] = name;
				maxNames++;

			} else {
				continue;
			}
		}
		System.out.print("\nName(s) With Character A:\n");
		for (String name : namesWithA) {
			if (name != null)
				System.out.print(name + "\t");
		}
		System.out.print("\nName(s) With Maximum Character:\n");
		for (int i = 0; i <= maxNames; i++)
			System.out.println(namesWithMax[i]);

	}
}
