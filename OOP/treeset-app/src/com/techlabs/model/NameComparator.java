package com.techlabs.model;

import java.util.Comparator;

public class NameComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem obj1, LineItem obj2) {
		return obj1.getName().compareTo(obj2.getName());
	}

}
