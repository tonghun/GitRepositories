package com.designmode.factory.simpleFactory.demo02;

import org.junit.Test;

/**
 * һ���������𴴽����в�Ʒ
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
