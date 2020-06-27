package com.techlabs.factory;

public class TeslaFactory implements IAutomobileFactory{
	@Override
	public IAuto make() {
		return new Tesla();
	}
}
