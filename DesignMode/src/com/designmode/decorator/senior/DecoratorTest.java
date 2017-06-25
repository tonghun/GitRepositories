package com.designmode.decorator.senior;

import org.junit.Test;

public class DecoratorTest {

	/**
	 * 装饰者基类，原样实现了目标对象的方法，并未增强
	 */
	@Test
	public void test01() {
		ISomeService target = new SomeServiceImpl();
		ISomeService decorator = new SomeServiceWrapper(target);
		String result = decorator.doSome();
		System.out.println("result=" + result);
	}

	/**
	 * 一次增强，对装饰者基类增强
	 */
	@Test
	public void test02() {
		ISomeService target = new SomeServiceImpl();
		ISomeService decorator = new TrimDecorator(target);
		String result = decorator.doSome();
		System.out.println("result=" + result);
	}

	/**
	 * 形成装饰者链，逐级增强
	 */
	@Test
	public void test03() {
		ISomeService target = new SomeServiceImpl();
		ISomeService trimDecorator = new TrimDecorator(target);// 一级增强
		ISomeService service = new UpperDecorator(trimDecorator);// 二级增强
		String result = service.doSome();
		System.out.println("result=" + result);
	}

}
