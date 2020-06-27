package com.techlabs.factory;

public class BmwFactory implements IAutomobileFactory {
	@Override
	public IAuto make() {
		return new Bmw();
	}
}
