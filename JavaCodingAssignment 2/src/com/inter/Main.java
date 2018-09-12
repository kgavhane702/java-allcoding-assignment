package com.inter;

import com.core.*;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Maruti", 123);
		vehicle1.display();

		// Static Binding
		TwoWheeler twoWheelerStatic = new TwoWheeler("Xyz", 382, 2);
		twoWheelerStatic.display();

		ThreeWheeler threeWheelerStatic = new ThreeWheeler("abc", 53, 356);
		threeWheelerStatic.display();

		// Dynamic Binding

		VehicleInterface vehicleDynamic = new TwoWheeler("new vehicle", 4334, 533);
		vehicleDynamic.display();

		VehicleInterface vehicleD = new ThreeWheeler("k", 43, 2);
		vehicleD.display();
	}

}
