package com.core;

public class MySingleTonClass {

	private static MySingleTonClass myObj;

	private MySingleTonClass() {
		// TODO Auto-generated constructor stub
	}

	public static MySingleTonClass getInstance() {
		if (myObj == null) {
			myObj = new MySingleTonClass();
		}
		return myObj;
	}

	public void getSomeThing() {
		// do something here
		System.out.println("I am here....");
	}

	public static void main(String a[]) {
		MySingleTonClass st = MySingleTonClass.getInstance();
		st.getSomeThing();
	}
}
