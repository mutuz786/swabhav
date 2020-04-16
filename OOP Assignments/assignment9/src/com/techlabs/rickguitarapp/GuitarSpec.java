package com.techlabs.rickguitarapp;

public class GuitarSpec {
	private String model;
	private int numString;
	private Builder builder;
	private Type type;
	private Wood backWood;
	private Wood frontWood;

	public GuitarSpec(String model, int numString, Builder builder, Type type, Wood backWood, Wood frontWood) {
		this.model = model;
		this.numString = numString;
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.frontWood = frontWood;
	}

	public String getModel() {
		return model;
	}

	public Builder getBuilder() {
		return builder;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getFrontWood() {
		return frontWood;
	}

	public int getNumString() {
		return numString;
	}

	public boolean matches(GuitarSpec spec) {
		if (this.model != null && !this.model.equals("") && !this.model.equals(spec.getModel()))
			return false;
		if (this.numString != spec.getNumString())
			return false;
		if (this.builder != spec.getBuilder())
			return false;
		if (this.type != spec.getType())
			return false;
		if (this.backWood != spec.getBackWood())
			return false;
		if (this.frontWood != spec.getFrontWood())
			return false;
		return true;
	}
}
