package com.designmode.proxy.dynamic.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

	private ProductInterface p;

	public MyHandler(ProductInterface p) {
		super();
		this.p = p;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		method.invoke(p, args);// 通过反射机制执行对象中的方法
		after();
		return null;
	}

	public void before() {
		System.out.println("动态代理在目标对象执行前执行");
	}

	public void after() {
		System.out.println("动态代理在目标对象执行后执行");
	}
}
