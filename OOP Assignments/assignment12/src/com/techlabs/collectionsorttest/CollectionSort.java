package com.techlabs.collectionsorttest;

import java.util.*;

public class CollectionSort {
	static HashSet<String> hashSet = new HashSet<String>();
	static TreeSet<String> treeSet = new TreeSet<String>();
	static HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	static TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

	public static void main(String[] args) {
		add(hashSet);
		add(hashMap);
		add(treeSet);
		add(treeMap);

		read(hashSet);
		read(hashMap);
		read(treeSet);
		read(treeMap);

		sort(hashSet);
	}

	private static void sort(Collection<String> collection) {
		List<String> list = new LinkedList<String>();
		list.addAll(collection);
		Collections.sort(list);
		System.out.println(list);
	}

	private static void read(Map<Integer, String> map) {
		for (Integer key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

	private static void read(Collection<String> collection) {
		for (String name : collection) {
			System.out.println(name);
		}
	}

	private static void add(Map<Integer, String> map) {
		map.put(3, "murtaza");
		map.put(5, "sagar");
		map.put(1, "gaurav");
		map.put(4, "rahul");
		map.put(2, "sahil");
	}

	private static void add(Collection<String> collection) {
		collection.add("murtaza");
		collection.add("sagar");
		collection.add("gaurav");
		collection.add("rahul");
		collection.add("sahil");
	}
}
