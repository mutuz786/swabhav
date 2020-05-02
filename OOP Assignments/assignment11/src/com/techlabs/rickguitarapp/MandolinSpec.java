package com.techlabs.rickguitarapp;

public class MandolinSpec implements InstrumentSpec {
	private String model;
	private Style style;
	private Builder builder;
	private Type type;
	private Wood backWood;
	private Wood frontWood;

	public MandolinSpec(String model, Style style, Builder builder, Type type, Wood backWood, Wood frontWood) {
		this.model = model;
		this.style = style;
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

	public Style getStyle() {
		return style;
	}

	@Override
	public boolean matches(InstrumentSpec spec) {
		if(spec instanceof MandolinSpec) {
			MandolinSpec newSpec = (MandolinSpec) spec;
			if (this.model != null && !this.model.equals("") && !this.model.equals(newSpec.getModel()))
				return false;
			if (this.style != newSpec.getStyle())
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
