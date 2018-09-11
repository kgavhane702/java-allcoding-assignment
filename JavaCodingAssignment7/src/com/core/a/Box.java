package com.core.a;

public class Box<T> {

	T item;

	public Box(T item) {
		super();
		this.item = item;
	}

	public Box() {
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
