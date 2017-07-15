package com.javase.collections.map;

import java.util.HashMap;

/**
 * 计数器：用于计数的对象采用可变对象数组
 * 
 * @author tonghuo
 *
 */
public class Counter {

	public void test01() {
		String str = "abc efe hig klm nop qrs";
		String[] arr = str.split(" ");

		HashMap<String, int[]> map = new HashMap<String, int[]>();
		for (String x : arr) {
			int[] count = map.get(x);
			if (count != null)
				count[0]++;
			else
				map.put(x, new int[] { 1 });
		}
	}

}
