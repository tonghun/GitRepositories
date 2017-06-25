package com.designmode.proxy.dynamic.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

	private Object sub;

	public DynamicProxy() {

	}

	public DynamicProxy(Object sub) {
		this.sub = sub;
	}

	/*
	 * �÷������ڷ��ش�����ʵ�������ܶ���Ϊ��̬����Ϊ��̬������޹أ��Ͳ���ʵ�ֶ�̬�Ĺ�����
	 */
	@SuppressWarnings("rawtypes")
	public Object getProxyInstance() {

		Class c = sub.getClass();

		return Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��ʵ������֮ǰ");
		arg1.invoke(sub, arg2);
		System.out.println("��ʵ������֮��");
		return null;
	}

}
