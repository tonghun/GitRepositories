package com.javase.collections.map;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator<K, V extends Comparable<? super V>> implements Comparator<K> {

	private Map<K, V> map;

	public ValueComparator(Map<K, V> map) {
		this.map = map;
	}

	@Override
	public int compare(K k1, K k2) {
		return map.get(k1).compareTo(map.get(k2));
	}

}
