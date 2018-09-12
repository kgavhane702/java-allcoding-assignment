package com.core;

public class Switch_String {
	public static void main(String[] args) {
		String string = "tdwo";
		switch (string) {
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("two");
			break;
		case "three":
			System.out.println("three");
			break;
		default:
			System.out.println("no match");
		}
	}
}