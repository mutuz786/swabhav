package com.techlabs.product;

public class AutomobileFactory {
	private static AutomobileFactory automobileFactory;

	private AutomobileFactory() {
	}

	public static AutomobileFactory getInstance() {
		if (automobileFactory == null) {
			automobileFactory = new AutomobileFactory();
		}
		return automobileFactory;
	}

	public IAuto make(AutoType autoType) {
		return autoType.getAuto();
	}
}
