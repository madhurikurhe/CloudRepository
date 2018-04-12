package com.techlabs.ricks.guitar;

public class GuitarSpec extends InstrumentSpec {
	Builder builder;
	String model;
	Wood topwood;
	Wood backwood;
	Type type;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, Wood backwood,
			Wood topwood, int numStrings) {
		super(builder, model, type, backwood, topwood);
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

	public boolean matches(InstrumentSpec otherSpec) {
		if (!super.matches(otherSpec))
			return false;

		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof GuitarSpec))
			return false;
		GuitarSpec spec = (GuitarSpec) otherSpec;
		if (numStrings != spec.numStrings)
			return false;
		return true;
	}
}
