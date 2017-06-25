package com.designmode.factory.factorymethod.demo02;

import org.junit.Test;

/**
 * 工厂方法模式：为每一个产品分配了一个专有的创建工厂
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
