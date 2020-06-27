package com.techlabs.product;

public enum AutoType {
	BMW, AUDI, TESLA;

	public IAuto getAuto() {
		if (this == AutoType.AUDI) {
			return new Audi();
		}
		if (this == AutoType.BMW) {
			return new Bmw();
		}
		if (this == AutoType.TESLA) {
			return new Tesla();
		}
		return null;
	}
}
