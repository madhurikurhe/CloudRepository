package com.techlabs.ricks.guitar;

public class GuitarSpec {
	Builder builder;
	String model;
	Wood topwood;
	Wood backwood;
	Type type;
	private int numStrings;

	public GuitarSpec(Builder fender, String model, Type electric, Wood alder,
			Wood alder2, int numStrings) {
		this.builder = fender;
		this.model = model;
		this.type = electric;
		this.backwood = alder;
		this.topwood = alder2;
		this.numStrings = numStrings;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackwood() {
		return backwood;
	}

	public Wood getTopwood() {
		return topwood;
	}

	public int getNumStrings() {
		return numStrings;

	}

	public boolean matches(GuitarSpec searchspec) {
		if (builder != searchspec.builder)
			return false;

		if (type != searchspec.type)
			return false;
		if (numStrings != searchspec.numStrings)
			return false;
		if (backwood != searchspec.backwood)
			return false;
		if (topwood != searchspec.topwood)
			return false;
		return true;
	}
}
