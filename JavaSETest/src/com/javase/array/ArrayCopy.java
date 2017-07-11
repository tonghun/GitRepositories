package com.javase.array;

import java.util.Arrays;

import org.junit.Test;

/**
 * 数组复制的常用方法
 * 
 * @author tonghuo
 *
 */
public class ArrayCopy {

	@Test
	public void test01() {
		int[] arr01 = { 1, 2, 3, 4, 5 };
		int[] arr02 = new int[6];
		System.arraycopy(arr01, 1, arr02, 2, 3);// 将一个数组从指定索引开始的指定长度的元素赋值到另一个数组的指定位置
		for (int x : arr02)
			System.out.println(x);
	}

}
