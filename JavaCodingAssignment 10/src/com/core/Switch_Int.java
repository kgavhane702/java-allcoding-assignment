package com.core;

import java.util.Scanner;

public class Switch_Int {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String LuckyColor;

		switch (scanner.nextInt()) {
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
