package com.techlabs.model;

import java.util.Comparator;

public class QuantityComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem obj1, LineItem obj2) {
		if (obj1.getQuantity() > obj2.getQuantity())
			return 1;
		if (obj1.getQuantity() < obj2.getQuantity())
			return -1;
		return 0;
	}

}
