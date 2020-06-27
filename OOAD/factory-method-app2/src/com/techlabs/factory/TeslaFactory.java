package com.techlabs.factory;

public class TeslaFactory implements IAutomobileFactory {
	private static IAutomobileFactory factory = null;

	private TeslaFactory() {

	}

	public static IAutomobileFactory getInstance() {
		if (factory == null) {
			factory = new TeslaFactory();
		}
		return factory;
	}

	@Override
	public IAuto make() {
		return new Tesla();
	}
}
