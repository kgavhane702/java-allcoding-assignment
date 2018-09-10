package com.inter;

public class ThreeWheeler extends VehicleImplementation {
	int noofleaf;

	public ThreeWheeler(String regno, int model, int noofleaf) {
		super(regno, model);
		this.noofleaf = noofleaf;
	}

	@Override
	public void display() {
		System.out.println("Three wheeler auto");
		super.display();
		System.out.println("No. of leaf:" + noofleaf);
	}
}
