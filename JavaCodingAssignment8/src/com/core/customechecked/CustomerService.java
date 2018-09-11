package com.core.customechecked;

public class CustomerService {
	public void findByName(String name) throws NameNotFoundException {

		if ("".equals(name)) {
			throw new NameNotFoundException("Name is empty!");
		}
		System.out.println(name);

	}

	public static void main(String[] args) {

		CustomerService obj = new CustomerService();

		try {

			obj.findByName("Kiran");
			obj.findByName("");

		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}

	}
}
