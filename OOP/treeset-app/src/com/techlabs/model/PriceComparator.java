package com.techlabs.model;

import java.util.Comparator;

public class PriceComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem obj1, LineItem obj2) {
		if (obj1.getPrice() > obj2.getPrice())
			return 1;
		if (obj1.getPrice() < obj2.getPrice())
			return -1;
		return 0;
	}

}
