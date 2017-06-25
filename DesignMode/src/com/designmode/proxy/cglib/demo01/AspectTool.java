package com.designmode.proxy.cglib.demo01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AspectTool implements MethodInterceptor {

	public void before() {
		System.out.println("在目标对象方法执行前执行");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		before();
		invocation.proceed();// 目标方法
		return null;
	}
}
