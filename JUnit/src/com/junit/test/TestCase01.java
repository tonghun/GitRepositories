package com.junit.test;

import org.junit.Test;

/**
 * 测试对象与被测试对象可以在同一个类中，底层实现遵循java的基本原则，通常将测试对象与被测试对象分在两个类中，
 * 因为被测试对象测试通过后是要正式发布的，如果其中混杂着测试对象不仅层次不清晰，而且正式发布前删除时可能出错。
 * 
 * @author tonghuo
 *
 */
public class TestCase01 {
	public void doIt() {
		System.out.println("doIt");
	}

	@Test
	public void test01() {
		doIt();

	}
}
