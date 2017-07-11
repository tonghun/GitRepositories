package com.javase.array;

import org.junit.Test;

/**
 * 空数组：创建时未指定长度，未赋初值的数组，一般创建形式为Object[] arr={}. 空数组长度未0。
 * 
 * @author tonghuo
 *
 */
public class EmptyArrayLength {

	@Test
	public void test01() {
		int[] arr01 = {};
		System.out.println(arr01.length);
	}

}
