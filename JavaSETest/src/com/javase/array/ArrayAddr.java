package com.javase.array;

import org.junit.Test;

/**
 * 数组中存储的是对象的内存地址
 * 
 * @author tonghuo
 *
 */
public class ArrayAddr {

	@Test
	public void test01() {
		Object obj01 = new Object();
		System.out.println(obj01);
		Object[] objArr = new Object[4];
		objArr[0] = obj01;
		System.out.println(objArr[0]);
	}

}
