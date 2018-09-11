package com.core.b;

public class KeyValueMain {

	public static void main(String[] args) {
		KeyValueInterface<Integer, String> keyvalue = new KeyValueImplementation<>();

		keyvalue.setKeyValue(1, "Kiran");

		System.out.println("Key is : " + keyvalue.getKey() + " and value is : " + keyvalue.getValue());

	}

}
