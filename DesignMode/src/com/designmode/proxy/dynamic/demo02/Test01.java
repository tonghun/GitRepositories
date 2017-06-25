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
		Subject subProxy = (Subject) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), handler);// ������ʵ����ʵ������ʵ��ɫʵ�ֵ�ȫ�����
		subject.delete("\ndelete����");
		subject.add("\nadd����");
	}

}
