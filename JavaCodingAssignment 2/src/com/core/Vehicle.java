package com.core;

public class Vehicle {
	private String regNumber;
	private int model;

	public Vehicle(String regno, int model) {
		super();
		this.regNumber = regno;
		this.model = model;
	}

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
