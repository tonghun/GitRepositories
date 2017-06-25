package com.designmode.proxy.dynamic.demo03;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class DynamciProxyTest {

	@Test
	public void testDynamicProxy() {
		ProductInterface real = new RealProduct();// ����ӿڱ�̣����ñ���Ϊ�ӿ�����
		MyHandler myHandler = new MyHandler(real);
		Class<? extends ProductInterface> class01 = real.getClass();
		class01.getClassLoader();

		ProductInterface proxyInstance = (ProductInterface) Proxy.newProxyInstance(class01.getClassLoader(),
				class01.getInterfaces(), myHandler);

		proxyInstance.doit01();
		proxyInstance.doit02(2, 3);
	}

}
