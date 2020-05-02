package com.techlabs.model.test;

import java.util.HashSet;

import com.techlabs.model.LineItem;

public class LineItemTest {
	public static void main(String[] args) {
		case1();
		case2();
	}

	private static void case1() {
		HashSet<String> names = new HashSet<String>();
		names.add("murtaza");
		names.add("murtaza");
		System.out.println(names.size());

	}

	private static void case2() {
		HashSet<LineItem> items = new HashSet<LineItem>();
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(101, "book", 10, 500));
		LineItem item3 = new LineItem(103, "pen", 10, 100);
		items.add(item3);
		items.add(item3);
		System.out.println(items.size());
	}
}
