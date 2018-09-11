package com.core.customechecked;

import java.util.Scanner;

public class CustomerService {
	public void findByName(String name) throws NameNotFoundException {

		if ("".equals(name)) {
			throw new NameNotFoundException("Name is empty!");
		}
		System.out.println(name);

	}

	public static void main(String[] args) {

		CustomerService obj = new CustomerService();
		try (Scanner sc = new Scanner(System.in)) {

			obj.findByName(sc.nextLine());
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}

	}
}
