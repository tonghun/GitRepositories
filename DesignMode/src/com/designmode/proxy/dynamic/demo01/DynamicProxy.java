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
	 * 该方法用于返回代理类实例，不能定义为静态，因为静态与对象无关，就不能实现动态的功能了
	 */
	@SuppressWarnings("rawtypes")
	public Object getProxyInstance() {

		Class c = sub.getClass();

		return Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("真实对象处理之前");
		arg1.invoke(sub, arg2);
		System.out.println("真实对象处理之后");
		return null;
	}

}
