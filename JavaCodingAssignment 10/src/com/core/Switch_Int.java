package com.core;

import java.util.Scanner;

public class Switch_Int {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String LuckyColor;

		switch (sc.nextInt()) {
		case 1:
			LuckyColor = "Red";
			break;
		case 2:
			LuckyColor = "Green";
			break;
		default:
			LuckyColor = "Invalid Color";
			break;

		}
		System.out.println(LuckyColor);
	}

}
