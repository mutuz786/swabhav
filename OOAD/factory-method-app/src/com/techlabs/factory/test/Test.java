package com.techlabs.factory.test;

import com.techlabs.factory.*;

public class Test {
	public static void main(String[] args) {
		IAutomobileFactory factory = AudiFactory.getInstance();
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
	}
}
