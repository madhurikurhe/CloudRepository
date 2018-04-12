package com.techlabs.ricks.guitar;

public abstract class InstrumentSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backwood;
	private Wood topWood;

	public InstrumentSpec(Builder builder, String model, Type type,
			Wood backwood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backwood = backwood;
		this.topWood = topWood;
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

	public Wood getTopWood() {
		return topWood;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((backwood == null) ? 0 : backwood.hashCode());
		result = prime * result + ((builder == null) ? 0 : builder.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((topWood == null) ? 0 : topWood.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if(builder!=otherSpec.builder)
			return false;
		if((model!=null) && (!model.equals("")) &&(!model.equals(otherSpec.model)))
		return false;
		if(type!=otherSpec.type)
			return false;
		if(backwood!=otherSpec.backwood)
			return false;
		if(topWood!=otherSpec.topWood)
			return false;
		return true;
		
	}
	
	
}
