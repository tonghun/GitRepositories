package com.designmode.proxy.dynamic.demo03;

/**
 * 动态代理中的接口：保证可以按照被代理对象的方式操作代理对象，因为两者实现了共同的接口， 拥有相同的方法，
 * 可以通过接口类型引用变量调用
 * 
 * @author tonghuo
 *
 */
public interface ProductInterface {
	void doit01();

	void doit02(int a, int b);
}
