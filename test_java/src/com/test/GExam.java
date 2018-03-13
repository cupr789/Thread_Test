package com.test;

import java.util.ArrayList;
import java.util.List;

public class GExam<K,V> {
	List<K> keyList = new ArrayList<K>();
	List<V> valueList = new ArrayList<V>();
	
	public void put(K key,V value) {
		if(keyList.indexOf(key)!=-1) {
			valueList.set(keyList.indexOf(key),value);
		}else {
			keyList.add(key);
			valueList.add(value);
		}
	}
	
	public V get(K key) {
		if(keyList.indexOf(key)!=-1) {
			return valueList.get(keyList.indexOf(key));
		}		
		return null;
	}
}
