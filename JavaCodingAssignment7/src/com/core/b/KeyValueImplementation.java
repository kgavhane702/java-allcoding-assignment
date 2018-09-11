package com.core.b;

public class KeyValueImplementation<K, V> implements KeyValueInterface<K, V> {

	private K key;
	private V value;

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public void setKeyValue(K k, V v) {
		this.key = k;
		this.value = v;

	}

}
