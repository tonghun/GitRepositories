package com.javase.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * String中的方法用于比较两个字符串的大小，比较按照“操作对象减去参数”进行，返回值为正，大于参数。
 * 
 * @author tonghuo
 *
 */
public class StringMethod {

	@Test
	public void testCompare() {
		String str01 = "a";
		int res = str01.compareTo("b");// 操作对象减去参数
		System.out.println("res:" + res);
	}

	@Test
	public void testComparable() {
		List<String> list = new ArrayList<String>();
		list.add("e");
		list.add("h");
		list.add("a");
		for (String x : list)
			System.out.println(x);
		System.out.println("--------------");
		Collections.sort(list);
		for (String x : list)
			System.out.println(x);
	}

}
