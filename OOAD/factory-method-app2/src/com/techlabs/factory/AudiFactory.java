package com.techlabs.factory;

public class AudiFactory implements IAutomobileFactory {
	private static IAutomobileFactory factory = null;

	private AudiFactory() {

	}

	public static IAutomobileFactory getInstance() {
		if (factory == null) {
			factory = new AudiFactory();
		}
		return factory;
	}

	@Override
	public IAuto make() {
		return new Audi();
	}
}
