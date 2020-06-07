package com.techlabs.facadedesigntest.test;

import com.techlabs.facadedesigntest.Feeder;

public class Test {
	public static void main(String[] args) {
		Feeder feeder = new Feeder();
		feeder.feedCat();
		feeder.feedDog();
		feeder.feedCow();
		feeder.feedPig();
	}
}
