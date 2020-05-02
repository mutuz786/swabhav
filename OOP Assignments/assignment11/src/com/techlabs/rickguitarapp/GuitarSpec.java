package com.techlabs.rickguitarapp;

public class GuitarSpec implements InstrumentSpec {
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

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public Builder getBuilder() {
		return builder;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public Wood getBackWood() {
		return backWood;
	}

	@Override
	public Wood getFrontWood() {
		return frontWood;
	}

	public int getNumString() {
		return numString;
	}

	@Override
	public boolean matches(InstrumentSpec spec) {
		if (spec instanceof GuitarSpec) {
			GuitarSpec newSpec = (GuitarSpec) spec;
			if (this.model != null && !this.model.equals("") && !this.model.equals(newSpec.getModel()))
				return false;
			if (this.numString != newSpec.getNumString())
				return false;
			if (this.builder != newSpec.getBuilder())
				return false;
			if (this.type != newSpec.getType())
				return false;
			if (this.backWood != newSpec.getBackWood())
				return false;
			if (this.frontWood != newSpec.getFrontWood())
				return false;
			return true;
		}
		return false;
	}
}
