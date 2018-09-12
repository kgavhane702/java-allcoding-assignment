package com.core;

public class ThreeWheeler extends Vehicle {
	int noOfLeaf;

	public ThreeWheeler(String regNumber, int model, int noOfLeaf) {
		super(regNumber, model);
		this.noOfLeaf = noOfLeaf;
	}

	@Override
	public void display() {
		System.out.println("Three wheeler auto");
		super.display();
		System.out.println("No. of leaf:" + noOfLeaf);
	}
}
