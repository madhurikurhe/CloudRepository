package com.techlabs.ricks.guitar;

public class Guitar extends Instrument {
	private String serialNumber;
	private GuitarSpec spec;
	private double price;


	public Guitar (String serialNumber,double price,GuitarSpec spec){
		super(serialNumber,price,spec);
		this.serialNumber = serialNumber;
		this.price = price;
	
		
	}
	public String getSerialNumber() {
		return serialNumber;

	}

	public void setPrice(double price) {
	}

	public double getPrice() {
		return price;
	}

	public void setSpec(GuitarSpec spec) {

		this.spec = spec;
	}
}