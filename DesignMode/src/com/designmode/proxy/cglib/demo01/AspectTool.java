package com.designmode.proxy.cglib.demo01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AspectTool implements MethodInterceptor {

	public void before() {
		System.out.println("��Ŀ����󷽷�ִ��ǰִ��");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		before();
		invocation.proceed();// Ŀ�귽��
		return null;
	}
}
