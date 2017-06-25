package com.designmode.factory.factorymethod.demo02;

import org.junit.Test;

/**
 * ��������ģʽ��Ϊÿһ����Ʒ������һ��ר�еĴ�������
 * 
 * @author tonghuo
 *
 */
public class FactoryMethodTest {
	@Test
	public void test() {
		Factory factory = new RealFactory02();
		Product p = factory.getInstance();
		p.printInfo();
	}
}
