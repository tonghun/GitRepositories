package com.javase.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import java.util.Map.Entry;

/**
 * 按照value对HashMap进行排序，底层用到TreeMap，实际上在指定TreeMap的排序方法时使用的对比的是value的值。
 * 
 * @author tonghuo
 *
 */
public class SortMapByValue {

	@Test
	public void test01() {
		Map<String, Integer> stus = new HashMap<String, Integer>();
		stus.put("zhangsan", 20);
		stus.put("lisi", 15);
		stus.put("wanger", 30);
		stus.put("mazi", 25);
     
		for (Entry<String, Integer> x : stus.entrySet()) {
			System.out.println(x.getKey() + "=" + x.getValue());
		}

		Map<String, Integer> sorter = new TreeMap<String, Integer>(new ValueComparator<String, Integer>(stus));
		sorter.putAll(stus);// 将HashMap中的元素全部复制到TreeMap中，在TreeMap中排序，HashMap不变

		System.out.println("按照value排序后");
		for (Entry<String, Integer> x : sorter.entrySet()) {
			System.out.println(x.getKey() + "=" + x.getValue());
		}

		System.out.println();
		for (Entry<String, Integer> x : stus.entrySet()) {
			System.out.println(x.getKey() + "=" + x.getValue());
		}
	}

	@Test
	public void testSortTool() {
		Map<String, Integer> stus = new HashMap<String, Integer>();
		stus.put("zhangsan", 20);
		stus.put("lisi", 15);
		stus.put("wanger", 30);
		stus.put("mazi", 25);

		for (Entry<String, Integer> x : stus.entrySet()) {
			System.out.println(x.getKey() + "=" + x.getValue());
		}

		System.out.println("-----------------");
		
		Map<String, Integer> sortedValueMap = MapUtils.sortByValue(stus);
		for (Entry<String, Integer> x : sortedValueMap.entrySet()) {
			System.out.println(x.getKey() + "=" + x.getValue());
		}
	}
}
