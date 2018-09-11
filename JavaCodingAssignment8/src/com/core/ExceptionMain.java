package com.core;

public class ExceptionMain {

	public static void main(String[] args) {

		Division division = new Division();
		try {
			division.myDivision(100, 10);
			division.myDivision(100, 0);
		} catch (DevidByZeroException e) {
			e.printStackTrace();
		}
	}

}
