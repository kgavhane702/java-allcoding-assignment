package com.core.b;

public interface KeyValueInterface<K, V> {

	public K getKey();

	public V getValue();

	public void setKeyValue(K k, V v);
}
