package com.designmode.proxy.dynamic.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test01 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		Subject rs = new RealSubject02();

		InvocationHandler handler = new DynamicProxy(rs);
		Class  c = rs.getClass();// ��ȡ���ص�JVM�еĶ�������������Ϣ

		// ��������������ʵ������������ҵ�񣬽�ҵ��ת����handler������
		Subject subject = (Subject) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), handler);

		// DynamicProxy d = new DynamicProxy(rs);
		// Subject subject = (Subject) d.getProxyInstance();//
		// �Ѵ���ʵ���Ĵ�����װ������ȷ���ǲ�ֱ�ۣ���Ҫ�˽��´����ĺ���getProxyInstance�Ĺ���
		subject.request();

	}

}
