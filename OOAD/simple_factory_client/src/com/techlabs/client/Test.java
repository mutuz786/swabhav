package com.techlabs.client;

import com.techlabs.product.*;

public class Test {
	public static void main(String[] args) {
		AutomobileFactory automobileFactory = AutomobileFactory.getInstance();
		IAuto auto = automobileFactory.make(AutoType.AUDI);
		System.out.println(auto.getClass());
		auto.start();
		auto.stop();
	}
}
