package com.javase.classtest;

/**
 * 成员内部类与静态内部类创建对象的方式
 * 
 * @author tonghuo
 *
 */
@SuppressWarnings("unused")
public class InnerClassTest {

	private class groupClass {

	}

	public static class staticClass {

	}

	public void test01() {
		groupClass groupObj = new groupClass();
		staticClass staticObj = new staticClass();
	}

	public static void main(String[] args) {
		InnerClassTest testObj = new InnerClassTest();
		groupClass g = testObj.new groupClass();
		staticClass s = new InnerClassTest.staticClass();
	}
}
