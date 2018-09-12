package com.inter;

public class TwoWheeler implements VehicleInterface {

	private int noOfWheels;

	public TwoWheeler(String regNumber, int model, int noOfWheels) {

		this.noOfWheels = noOfWheels;
	}

	@Override
	public void display() {
		System.out.println("Two wheeler tvs");
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
