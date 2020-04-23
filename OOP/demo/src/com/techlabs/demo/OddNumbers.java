package com.techlabs.demo;

public class OddNumbers extends Numbers {

	public OddNumbers(int number) {
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 1)
				numberList.add(i);
		}
	}

}
