package com.javase.byteTest;

import org.junit.Test;

/**
 * 位运算是二进制运算
 * 
 * @author tonghuo
 *
 */
public class BitOperation {

	@Test
	public void test01() {
		int a = 9;
		System.out.println(a >> 2);// 9/2^2
		int b = 5;
		System.out.println(a | b);// 按位或的运算结果不会小于参与运算的最大值
		System.out.println(a & b);// 按位与的运算结果不会大于参与运算的最小值
	}

}
