package com.javase.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * 数组与集合相互转化
 * 
 * @author tonghuo
 *
 */
public class ArrayToList {

	/**
	 * 将数组转化为集合
	 */
	@Test
	public void testTransformToCollection() {
		Integer[] arr = new Integer[] { new Integer(1), new Integer(2) };
		List<Integer> IntList = new ArrayList<Integer>();
		Collections.addAll(IntList, arr);
	}

	/**
	 * 将集合中的元素复制到数组中，如果用于接收的数组的长度小于集合元素个数，返回一个存储全部元素的新数组。
	 * 如果数组长度大于集合数目，将集合中的元素全部复制到数组中，数组中剩余部分赋值为null。
	 */
	@Test
	public void testTransformToArray() {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			ints.add(i);
		}

		Integer[] arr = new Integer[10];// 数组长度大于元素个数
		ints.toArray(arr);
		for (Integer x : arr) {
			System.out.println("arr:" + x);
		}

		Integer[] arr01 = new Integer[2];// 数组长度小于元素个数
		ints.toArray(arr01);
		for (Integer x : arr01)
			System.out.println("arr01:" + x);
	}

}
