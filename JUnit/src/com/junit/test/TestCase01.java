package com.junit.test;

import org.junit.Test;

/**
 * ���Զ����뱻���Զ��������ͬһ�����У��ײ�ʵ����ѭjava�Ļ���ԭ��ͨ�������Զ����뱻���Զ�������������У�
 * ��Ϊ�����Զ������ͨ������Ҫ��ʽ�����ģ�������л����Ų��Զ��󲻽���β�������������ʽ����ǰɾ��ʱ���ܳ���
 * 
 * @author tonghuo
 *
 */
public class TestCase01 {
	public void doIt() {
		System.out.println("doIt");
	}

	@Test
	public void test01() {
		doIt();

	}
}
