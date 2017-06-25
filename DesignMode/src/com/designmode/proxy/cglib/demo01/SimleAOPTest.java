package com.designmode.proxy.cglib.demo01;

import org.springframework.aop.framework.ProxyFactory;
import org.junit.Test;

/**
 * һ���򵥵�CGLIB
 * 
 * @author tonghuo
 *
 */
public class SimleAOPTest {

	@Test
	public void test() {
		Target target = new Target();
		ProxyFactory proxyFactory = new ProxyFactory();// �������������ɴ�����������ǰ�������Ѵ�������һ������
		proxyFactory.setTarget(target);// �趨�������
		proxyFactory.addAdvice(new AspectTool());// �趨����
		Target proxy = (Target) proxyFactory.getProxy();// ���ɴ���
		proxy.doit();
	}

}
