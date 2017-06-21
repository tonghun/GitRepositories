package com.test.exception.demo01;

import org.junit.Test;

public class ExcetionType {

	@Test
	public void testExceptionType() {
		try {
			String[] s = { "s01", "s02" };
			System.out.println(s[2]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("e=" + e);
		}

		System.out.println("异常发生后");
	}

	/**
	 * try语句块中发生异常时，将继续执行catch语句块及后面的代码
	 */
	@Test
	public void testCatch() {
		int result = 0;
		try {
			result = 9 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}

		result = 9 / 3;
		System.out.println("result=" + result);
	}

	/**
	 * 运行时异常，发生在程序运行阶段，没有被处理
	 */
	@Test
	public void testNotCatch() {
		int result = 0;
		result = 9 / 0;

		result = 9 / 3;
		System.out.println("result=" + result);
	}

}
