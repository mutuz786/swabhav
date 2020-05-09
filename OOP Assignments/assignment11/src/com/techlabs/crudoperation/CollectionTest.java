package com.techlabs.crudoperation;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();

		addData(arrayList);
		addData(linkedList);
		addData(hashSet);
		addData(linkedHashSet);
		addData(treeSet);

		readData(arrayList);
		readData(linkedList);
		readData(hashSet);
		readData(linkedHashSet);
		readData(treeSet);

		deleteData(arrayList);
		deleteData(linkedList);
		deleteData(hashSet);
		deleteData(linkedHashSet);
		deleteData(treeSet);

		readData(arrayList);
		readData(linkedList);
		readData(hashSet);
		readData(linkedHashSet);
		readData(treeSet);

		search(arrayList);
		search(linkedList);
		search(hashSet);
		search(linkedHashSet);
		search(treeSet);
	}

	private static void search(Collection<Integer> collection) {
		int searchItem = 24;
		if (collection.contains(searchItem)) {
			System.out.println("the item is present");
		} else {
			System.out.println("item is not present");
		}
	}

	private static void deleteData(Collection<Integer> collection) {
		collection.remove(81);
	}

	private static void readData(Collection<Integer> collection) {
		System.out.println(collection);
	}

	private static void addData(Collection<Integer> collection) {
		collection.add(10);
		collection.add(5);
		collection.add(24);
		collection.add(81);
		collection.add(61);
	}
}
