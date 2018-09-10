package com.pgm;
import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter Number :");
		if(isPalindrome(getInput.nextInt()))
		{
			System.out.println("Number is palindrome!");
		}
		else
		{
			System.out.println("Number is not palindrome!");
		}
		
	}
	
	
	public static boolean isPalindrome(int integer) {
	    String integerToString = String.valueOf(integer); 
	    return integerToString.equals(new StringBuilder(integerToString).reverse().toString());
	}

}
