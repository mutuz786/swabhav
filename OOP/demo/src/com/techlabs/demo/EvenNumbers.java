package com.techlabs.demo;

public class EvenNumbers extends Numbers{

	public EvenNumbers(int number) {
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0)
				numberList.add(i);
		}
	}

}
