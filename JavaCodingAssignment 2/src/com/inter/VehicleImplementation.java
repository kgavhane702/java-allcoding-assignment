package com.inter;

public class VehicleImplementation implements VehicleInterface {

	private String regno;
	private int model;

	public VehicleImplementation(String regno, int model) {
		super();
		this.regno = regno;
		this.model = model;
	}

	@Override
	public void display() {
		System.out.println("Registration no: " + regno);
		System.out.println("Model no: " + model);
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", model=" + model + "]";
	}

}
