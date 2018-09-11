package com.core;

public class Division{

	public void myDivision(int number1, int number2) throws DevidByZeroException{
		
		if(number2 == 0)
			throw new DevidByZeroException("Can not devide by zero");
		else
		{
			System.out.println(number1/number2);
		}
	}

	
}
