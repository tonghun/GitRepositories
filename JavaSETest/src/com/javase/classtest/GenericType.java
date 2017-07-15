package com.javase.classtest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 泛型提供了一种安全地扩展程序适用范围的方式，不仅可以定义在类上，还可以定义在方法上，具体定义在public或者static后面。
 * 
 * @author tonghuo
 *
 */
@SuppressWarnings("hiding")
public class GenericType<T> {

	public <T, V> void doSome01(T a, V b) {
		System.out.println("a=" + a + "----" + "b=" + b);
	}

	public static <T, V> void doSome02(T a, V b) {
		System.out.println("a=" + a + "----" + "b=" + b);
	}

	public void doSome(GenericType<? extends Number> obj) {

	}

	/**
	 * 泛型擦除
	 */
	@Test
	public void testErasure() {
		List<String> strList = new ArrayList<String>();
		List<Integer> intList = new ArrayList<Integer>();
		System.out.println(strList.getClass() == intList.getClass());
	}

	@Test
	public void doit01() {
		this.doSome01(1, 1.0f);
	}

	@Test
	public void doit02() {
		doSome02(2, 2.0f);
	}
}
