package com.core.a;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box = new Box<Integer>();

		box.setItem(100);
		System.out.println(box.getItem());
		
		Box<String> boxString = new Box<String>();
		boxString.setItem("White box");
		System.out.println(boxString.getItem());
		
	}

}
