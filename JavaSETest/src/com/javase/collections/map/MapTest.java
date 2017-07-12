package com.javase.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class MapTest {

	/**
	 * 遍历Map集合的一种方法：获取获取键值对集合，然后遍历
	 */
	@Test
	public void testForeach() {
		Map<String, String> strs = new HashMap<String, String>();
		for (int i = 0; i < 20; i++) {
			strs.put("key0" + i, "value0" + i);
		}
		Set<Entry<String, String>> entrySet = strs.entrySet();
		for (Entry<String, String> x : entrySet) {
			System.out.println(x.getKey() + "=" + x.getValue());
		}
	}

	/**
	 * TreeMap按照key值排序
	 */
	@Test
	public void testTreeMap() {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("e", 1);
		map.put("d", 1);
		map.put("c", 1);
		map.put("b", 1);
		for (Entry<String, Integer> x : map.entrySet()) {
			System.out.println(x.getKey() + "=" + x.getValue());
		}
	}

}
