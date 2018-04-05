package com.techlabs.ricks.guitar;

public class Guitar {
	private String serialNumber;
	private GuitarSpec spec;
	private double price;

	public Guitar(String serialNumber, double price, int numStrings) {
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

	public GuitarSpec getSpec() {

		return spec;
	}

	public void setSpec(GuitarSpec spec) {

		this.spec = spec;
	}
}