package com.javase.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapUtils {

	/**
	 * 按照value升序排列集合。
	 * 
	 * @param map
	 * @return
	 */
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {

		Map<K, V> sorter = new TreeMap<K, V>(new ValueComparator<K, V>(map));
		sorter.putAll(map);

		return sorter;
	}

	private static class ValueComparator<K, T extends Comparable<? super T>> implements Comparator<K> {

		private Map<K, T> map;

		public ValueComparator(Map<K, T> map) {
			super();
			this.map = map;
		}

		// TreeMap会调用该方法对key进行排序，如果区分key大小的标准不再是key自身，而是对应的value，就实现了按照value进行排序
		@Override
		public int compare(K k1, K k2) {
			return map.get(k1).compareTo(map.get(k2));
		}

	}
}
