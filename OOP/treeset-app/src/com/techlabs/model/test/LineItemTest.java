package com.techlabs.model.test;

import java.util.TreeSet;

import com.techlabs.model.LineItem;
import com.techlabs.model.NameComparator;
import com.techlabs.model.PriceComparator;
import com.techlabs.model.QuantityComparator;

public class LineItemTest {
	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
		case5();
	}

	private static void case1() {
		TreeSet<String> names = new TreeSet<String>();
		names.add("murtaza");
		names.add("murtaza");
		System.out.println(names.size());

	}

	private static void case2() {
		TreeSet<LineItem> items = new TreeSet<LineItem>();
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(101, "book", 10, 500));
		LineItem item3 = new LineItem(103, "pen", 10, 100);
		items.add(item3);
		items.add(item3);
		System.out.println(items.size());
		for (LineItem item : items) {
			System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice() + " " + item.getQuantity());
		}
	}

	private static void case3() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new NameComparator());
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(106, "pencil", 10, 234));
		LineItem item3 = new LineItem(103, "pen", 10, 100);
		items.add(item3);
		items.add(item3);
		System.out.println(items.size());
		for (LineItem item : items) {
			System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice() + " " + item.getQuantity());
		}
	}

	private static void case4() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new PriceComparator());
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(106, "pencil", 34, 500));
		LineItem item3 = new LineItem(103, "pen", 21, 100);
		items.add(item3);
		items.add(item3);
		System.out.println(items.size());
		for (LineItem item : items) {
			System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice() + " " + item.getQuantity());
		}
	}

	private static void case5() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new QuantityComparator());
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(106, "pencil", 10, 234));
		LineItem item3 = new LineItem(103, "pen", 10, 100);
		items.add(item3);
		items.add(item3);
		System.out.println(items.size());
		for (LineItem item : items) {
			System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice() + " " + item.getQuantity());
		}
	}
}
