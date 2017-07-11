package com.javase.array;

import java.util.Arrays;

import org.junit.Test;

/**
 * 工具类Arrays中的常用方法，这些方法大多是静态的
 * 
 * @author tonghuo
 *
 */
public class ArraysTest {

	@Test
	public void test01() {
		int[] arr01 = new int[] { 1, 2, 4, 3 };

		int[] arr02 = Arrays.copyOf(arr01, 3);// 从缩影开始复制指定长度到新数组中
		for (int x : arr02)
			System.out.println(x);

		System.out.println("复制指定范围的数据到新数组");
		int[] arr03 = Arrays.copyOfRange(arr01, 1, 3);
		for (int x : arr03)
			System.out.println(x);

		System.out.println("按照升序排列数组");
		Arrays.sort(arr01);
		for (int x : arr01)
			System.out.println(x);

		System.out.println("对比两个数组是否相同：" + Arrays.equals(arr01, arr02));
		String[] strArr = new String[] { "Hello", "World" };
		System.out.println("将数组转化为字符串：" + Arrays.toString(strArr));// 将数组转化为字符串，相邻两个字符用"，"分割
	}

}
