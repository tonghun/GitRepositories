package com.designmode.factory.simpleFactory.demo02;

import org.junit.Test;

/**
 * 一个工厂负责创建所有产品
 * 
 * @author tonghuo
 *
 */
public class SimpleFactoryTest {

	@Test
	public void test() {
		Product product = Factory.getProduct(0);
		product.doit01();

	}

}
