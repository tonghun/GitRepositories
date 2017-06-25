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
		method.invoke(p, args);// ͨ���������ִ�ж����еķ���
		after();
		return null;
	}

	public void before() {
		System.out.println("��̬������Ŀ�����ִ��ǰִ��");
	}

	public void after() {
		System.out.println("��̬������Ŀ�����ִ�к�ִ��");
	}
}
