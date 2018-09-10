package com.core.main;

import com.core.ThreeWheeler;
import com.core.TwoWheeler;
import com.core.Vehicle;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Maruti", 123);
		vehicle1.display();

		
		//Static Binding
		TwoWheeler twoWheelerStatic = new TwoWheeler("Xyz", 382, 2);
		twoWheelerStatic.display();

		ThreeWheeler threeWheelerStatic = new ThreeWheeler("abc", 53, 356);
		threeWheelerStatic.display();
		
		
		//Dynamic Binding
		
		Vehicle vehicleDynamic = new TwoWheeler("dynamicTwowheeler", 43, 32);
		vehicleDynamic.display();

	}

}
