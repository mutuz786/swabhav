package com.techlabs.factory;

public class AudiFactory implements IAutomobileFactory{
	@Override
	public IAuto make() {
		return new Audi();
	}
}
