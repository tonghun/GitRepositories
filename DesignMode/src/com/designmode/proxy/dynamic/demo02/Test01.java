package com.designmode.proxy.dynamic.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test01 {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		System.out.println("main01");
		Subject subject = new RealSubject02();
		InvocationHandler handler = new DynamicHandler(subject);
		Class c = subject.getClass();
		Subject subProxy = (Subject) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), handler);// 代理类实现了实现了真实角色实现的全部借口
		subject.delete("\ndelete方法");
		subject.add("\nadd方法");
	}

}
