package com.inter;

public class ThreeWheeler extends VehicleImplementation {
	int noOfWheel;

	public ThreeWheeler(String regNo, int model, int noOfLeaf) {
		super(regNo, model);
		this.noOfWheel = noOfLeaf;
	}

	@Override
	public void display() {
		System.out.println("Three wheeler auto");
		super.display();
		System.out.println("No. of leaf:" + noOfWheel);
	}
}
