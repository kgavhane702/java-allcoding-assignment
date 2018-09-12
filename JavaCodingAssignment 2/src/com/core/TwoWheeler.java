package com.core;

public class TwoWheeler extends Vehicle {

	private int noOfWheels;

	public TwoWheeler(String regNumber, int model, int noOfWheels) {
		super(regNumber, model);
		this.noOfWheels = noOfWheels;
	}

	@Override
	public void display() {
		System.out.println("Two wheeler tvs");
		super.display();
		System.out.println("No. of wheel : " + noOfWheels);
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	@Override
	public String toString() {
		return "TwoWheeler [noOfWheels=" + noOfWheels + "]";
	}

}
