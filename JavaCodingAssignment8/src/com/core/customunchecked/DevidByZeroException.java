package com.core.customunchecked;

public class DevidByZeroException extends RuntimeException {

	public DevidByZeroException(String message) {
		System.out.println(message);
	}
}
