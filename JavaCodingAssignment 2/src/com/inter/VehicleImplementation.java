package com.inter;

public class VehicleImplementation implements VehicleInterface {

	private String regNumber;
	private int model;

	public VehicleImplementation(String regNumber, int model) {
		super();
		this.regNumber = regNumber;
		this.model = model;
	}

	@Override
	public void display() {
		System.out.println("Registration no: " + regNumber);
		System.out.println("Model no: " + model);
	}

	public String getRegno() {
		return regNumber;
	}

	public void setRegno(String regno) {
		this.regNumber = regno;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [regno=" + regNumber + ", model=" + model + "]";
	}

}
