package com.javase.classtest;

/**
 * 
 * @author tonghuo
 * 
 *         1.һ���������͵ı���������Ϊfinal���ͣ���ô�����������������ʱ�͸�ֵ������ֻ�ܸ�ֵһ�Σ�
 * 
 *         2.һ���������͵ı���������Ϊfinal���ͣ���ô�����������������ʱ��ָ�����󣬲�����ָ��Ķ����ܸı䣬 ��������ݿ��Ըı䡣
 */

public class FinalClassTest {

	@SuppressWarnings("unused")
	private static final int a = 3;

	private static final User user01 = new User();

	public static void main(String[] args) {

		user01.setName("123");

	}

}
