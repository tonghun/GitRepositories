package com.designmode.proxy.staticTest.demo02;

import org.junit.Test;

public class StaticProxyTest {

	@Test
	public void test01() {
		ISomeService proxy = new SomeServiceProxy();
		String result = proxy.doSome("abc");
		System.out.println("result=" + result);
	}

}
