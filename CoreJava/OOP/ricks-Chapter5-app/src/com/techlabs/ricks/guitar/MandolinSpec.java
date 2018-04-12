package com.techlabs.ricks.guitar;

public class MandolinSpec extends InstrumentSpec {

	private Style style;

	public MandolinSpec(Builder builder, String model, Type type, Style style,
			Wood backwood, Wood topWood) {
		super(builder, model, type, backwood, topWood);
		this.style = style;
	}

	public Style getStyle() {
		return style;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if (!super.matches(otherSpec))
			return false;

		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof GuitarSpec))
			return false;
		MandolinSpec spec = (MandolinSpec) otherSpec;
		if (!style.equals(spec.style))
			return false;
		return true;
	}

}
