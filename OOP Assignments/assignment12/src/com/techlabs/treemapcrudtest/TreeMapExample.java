package com.techlabs.treemapcrudtest;

import java.util.TreeMap;

public class TreeMapExample {
	static TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

	public static void main(String[] args) {
		add(2, "sagar");
		add(4, "rahul");
		add(1, "Murtaza");
		add(4, "sahil");
		add(3, "gaurav");

		read();

		delete(3);

		read();

		searchValue(2);

		searchKey("Murtaza");

	}

	private static void searchKey(String searchValue) {
		for (Integer key : treeMap.keySet()) {
			if (treeMap.get(key).equalsIgnoreCase(searchValue)) {
				System.out.println("the value is on " + key);
				return;
			}
		}
		System.out.println("key not found");
	}

	private static void searchValue(int searchKey) {
		for (Integer key : treeMap.keySet()) {
			if (key == searchKey) {
				System.out.println("the key contains " + treeMap.get(key));
				return;
			}
		}
		System.out.println("value not found");
	}

	private static void delete(int key) {
		treeMap.remove(key);
	}

	private static void read() {
		for (Integer key : treeMap.keySet()) {
			System.out.println(key + " " + treeMap.get(key));
		}
		System.out.println();
	}

	private static void add(int key, String value) {
		treeMap.put(key, value);
	}
}
