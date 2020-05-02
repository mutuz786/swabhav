package com.techlabs.rickguitarapp;

public interface InstrumentSpec {
	public String getModel();

	public Builder getBuilder();

	public Type getType();

	public Wood getBackWood();

	public Wood getFrontWood();

	public boolean matches(InstrumentSpec spec);
}
