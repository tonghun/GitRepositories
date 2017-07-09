package com.javase.classtest.interfaceTest;

import org.junit.Test;

/**
 * 一个接口可以继承多个接口，这样就拥有了其他接口的抽象方法，需要实现这些抽象方法
 * 
 * @author tonghuo
 *
 */
public class InterfaceExtendsTest {

	@Test
	public void test01() {
		SomeClass some = new SomeClass();
		some.doit01();
		some.doit02();
	}

}
