package com.core;

public class Vehicle {
	private String regno;
	private int model;

	public Vehicle(String regno, int model) {
		super();
		this.regno = regno;
		this.model = model;
	}

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
