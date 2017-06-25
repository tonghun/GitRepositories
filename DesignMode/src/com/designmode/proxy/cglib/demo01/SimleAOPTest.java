package com.designmode.proxy.cglib.demo01;

import org.springframework.aop.framework.ProxyFactory;
import org.junit.Test;

/**
 * 一个简单的CGLIB
 * 
 * @author tonghuo
 *
 */
public class SimleAOPTest {

	@Test
	public void test() {
		Target target = new Target();
		ProxyFactory proxyFactory = new ProxyFactory();// 代理工厂用来生成代理，代理生成前代理工厂已处理完了一切问题
		proxyFactory.setTarget(target);// 设定代理对象
		proxyFactory.addAdvice(new AspectTool());// 设定切面
		Target proxy = (Target) proxyFactory.getProxy();// 生成代理
		proxy.doit();
	}

}
