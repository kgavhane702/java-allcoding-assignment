package com.core;

public class MySingleTonClass {

	private static MySingleTonClass myObj;
	private int i;
	private static int count = 0;
	
	
	private MySingleTonClass() {
		// TODO Auto-generated constructor stub
	}

	public static MySingleTonClass getInstance() {
		if (count < 1) {
			myObj = new MySingleTonClass();
			count++;
		}
		return myObj;
	}

	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void getSomeThing() {
		// do something here
		System.out.println("I am here...." + this.getI());
	}

	public static void main(String a[]) {
		MySingleTonClass st = MySingleTonClass.getInstance();
		MySingleTonClass st1 = MySingleTonClass.getInstance();
		MySingleTonClass st2 = MySingleTonClass.getInstance();
		MySingleTonClass st3 = MySingleTonClass.getInstance();
		st.setI(10);
		st1.setI(20);
		st2.setI(30);
		st3.setI(40);
		st.getSomeThing();
		st1.getSomeThing();
		st2.getSomeThing();
		st3.getSomeThing();
	}
}
