package com.javase.integer;

import org.junit.Test;

/**
 * 数据类型转换是将一个值从一种类型转换为另一种类型，存在两种类型转换方式：
 * 1.隐式类型转化：将低精度类型转化为高精度类型，数据不会溢出，系统自动执行， 程序员无需进行任何操作。
 * 2.显式类型转化：将高精度类型转化为低精度类型，必须又程序员手动进行。
 * 3.基本数据类型精度由低到高byte<short<int<long<float<double
 * 
 * @author tonghuo
 *
 */
public class TypeConversion {

	@Test
	public void test01() {
		float s = 1;
		/*	s = s + 1;*/
		System.out.println("s=" + (s + 2));
	}

}
