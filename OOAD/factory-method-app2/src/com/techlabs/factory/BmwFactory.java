package com.techlabs.factory;

public class BmwFactory implements IAutomobileFactory {
	private static IAutomobileFactory factory = null;

	private BmwFactory() {

	}

	public static IAutomobileFactory getInstance() {
		if (factory == null) {
			factory = new BmwFactory();
		}
		return factory;
	}

	@Override
	public IAuto make() {
		return new Bmw();
	}
}
