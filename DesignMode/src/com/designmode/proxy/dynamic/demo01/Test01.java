package com.designmode.proxy.dynamic.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test01 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		Subject rs = new RealSubject02();

		InvocationHandler handler = new DynamicProxy(rs);
		Class  c = rs.getClass();// 获取加载到JVM中的对象所属的类信息

		// 用来创建代理类实例，本身不处理业务，将业务转发给handler来处理
		Subject subject = (Subject) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), handler);

		// DynamicProxy d = new DynamicProxy(rs);
		// Subject subject = (Subject) d.getProxyInstance();//
		// 把代理实例的创建封装起来，确定是不直观，需要了解新创建的函数getProxyInstance的功能
		subject.request();

	}

}
