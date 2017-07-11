package com.javase.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * 对比ArrayList与LinkedList性能
 * 
 * @author tonghuo
 *
 */
public class CompareTest {

	/**
	 * 从尾部增加元素时，ArrayList效率高于LinkedList
	 */
	@Test
	public void testAddTail() {

		List<Integer> array = new ArrayList<Integer>();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			array.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ArrayList useTime::" + (endTime - startTime));

		List<Integer> linked = new LinkedList<Integer>();
		long startTime01 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			linked.add(i);
		}
		long endTime01 = System.currentTimeMillis();
		System.out.println("LinkedList useTime::" + (endTime01 - startTime01));
	}

	/**
	 * 从尾部删除元素，ArrayList效率高于LinkedList
	 */
	@Test
	public void testRemoveTail() {
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			array.add(i);
		}

		int arrayIndex = array.size() - 1;
		long startTime = System.currentTimeMillis();
		while (arrayIndex >= 0) {
			array.remove(arrayIndex);
			arrayIndex--;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ArrayList useTime::" + (endTime - startTime));

		List<Integer> linked = new LinkedList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			linked.add(i);
		}

		int linkedIndex = linked.size() - 1;
		long startTime01 = System.currentTimeMillis();
		while (linkedIndex >= 0) {
			linked.remove(linkedIndex);// 从集合中删除一个元素，集合程度减1
			linkedIndex--;
			// System.out.println("集合长度："+linked.size());
		}
		long endTime01 = System.currentTimeMillis();
		System.out.println("LinkedList useTime::" + (endTime01 - startTime01));
	}

	/**
	 * 在List集合中间插入或者删除元素时，LinkedList高于ArrayList
	 */
	@Test
	public void testInsert() {

		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			array.add(0);

		long startTime01 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			array.add(2, i);
		}
		long endTime01 = System.currentTimeMillis();
		System.out.println("array useTime:" + (endTime01 - startTime01));

		List<Integer> link = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++)
			link.add(0);

		long startTime02 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			link.add(2, i);
		}
		long endTime02 = System.currentTimeMillis();
		System.out.println("link useTime:" + (endTime02 - startTime02));
	}

	@Test
	public void testSize() {
		List<String> strs = new ArrayList<String>();
		strs.add("a");
		strs.add("b");
		strs.add(null);
		strs.add(null);
		strs.add("c");
		strs.remove(null);// 删除在集合中第一次出现时的值，不是删除全部
		System.out.println(strs.size());
		for (String x : strs)
			System.out.println(x);

		String[] strArr = new String[5];
		for (String x : strArr)
			System.out.println(x);
	}

}
