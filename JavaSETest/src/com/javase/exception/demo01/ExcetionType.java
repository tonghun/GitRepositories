package com.javase.exception.demo01;

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

		System.out.println("�쳣������");
	}

	/**
	 * try�����з����쳣ʱ��������ִ��catch���鼰����Ĵ���
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
	 * ����ʱ�쳣�������ڳ������н׶Σ�û�б�����
	 */
	@Test
	public void testNotCatch() {
		int result = 0;
		result = 9 / 0;

		result = 9 / 3;
		System.out.println("result=" + result);
	}

}
