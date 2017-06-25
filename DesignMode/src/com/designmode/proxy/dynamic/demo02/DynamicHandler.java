package com.designmode.proxy.dynamic.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicHandler implements InvocationHandler {

	private Object subject;

	public DynamicHandler() {

	}

	public DynamicHandler(Object obj) {
		this.subject = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		method.invoke(subject, args);
		return null;
	}
}
