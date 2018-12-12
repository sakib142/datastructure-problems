package com.thread.reentrantlock;

import java.util.HashMap;
import java.util.Map;

public class CustomMap<K, V> extends HashMap<K, V> {

	/**
	* 
	*/
	public Map<K, V> map = new HashMap();
	private static final long serialVersionUID = 1L;

	public CustomMap(Map<K, V> map) {
		super(map);
//		map.putAll(map);
	}

	@Override
	public V put(K key, V value) {
// TODO Auto-generated method stub
		try {
			throw new IllegalAccessException();
		} catch (IllegalAccessException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	@Override
	public V remove(Object key) {
		try {
			throw new IllegalAccessException();
		} catch (IllegalAccessException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.remove(key);
	}

	@Override
	public boolean remove(Object key, Object value) {
		try {
			throw new IllegalAccessException();
		} catch (IllegalAccessException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.remove(key, value);
	}
	@Override
	public V get(Object key) {
		return super.get(key);
	}

}
