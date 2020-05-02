package com.techlabs.model.test;

import java.util.ArrayList;

import com.techlabs.model.LineItem;

public class LineItemTest {
	public static void main(String[] args) {
		case1();
		case2();
	}

	private static void case1() {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(101, "book", 10, 500));
		cart.add(new LineItem(102, "pen", 5, 50));
		cart.add(new LineItem(103, "pencil", 3, 10));
		cart.add("swabhav");
		double total = 0;
		for (Object obj : cart) {
			if (obj instanceof LineItem) {
				LineItem newObject = (LineItem) obj;
				total += newObject.calculateTotal();
			}
		}
		System.out.println("cost:" + total);
	}

	private static void case2() {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(101, "book", 10, 500));
		cart.add(new LineItem(102, "pen", 5, 50));
		cart.add(new LineItem(103, "pencil", 3, 10));
		//cart1.add("swabhav");
		double total = 0;
		for (LineItem item : cart) {
			total += item.calculateTotal();
		}
		System.out.println("cost:" + total);

	}

}
