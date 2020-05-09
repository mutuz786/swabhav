package com.techlabs.hashmapcrudtest;

import java.util.HashMap;

public class HashMapExample {
	static HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

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
		for (Integer key : hashMap.keySet()) {
			if (hashMap.get(key).equalsIgnoreCase(searchValue)) {
				System.out.println("the value is on " + key);
				return;
			}
		}
		System.out.println("key not found");
	}

	private static void searchValue(int searchKey) {
		for (Integer key : hashMap.keySet()) {
			if (key == searchKey) {
				System.out.println("the key contains " + hashMap.get(key));
				return;
			}
		}
		System.out.println("value not found");
	}

	private static void delete(int key) {
		hashMap.remove(key);
	}

	private static void read() {
		for (Integer key : hashMap.keySet()) {
			System.out.println(key + " " + hashMap.get(key));
		}
		System.out.println();
	}

	private static void add(int key, String value) {
		hashMap.put(key, value);
	}
}
