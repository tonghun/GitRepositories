package com.javase.classtest;

/**
 * 对象初始化时的执行顺序：静态语句块>静态变量初始化>实例语句块>成员变量初始化>构造方法
 * 
 * @author tonghuo
 *
 */
public class InitializationSequence {

	static {
		System.out.println("静态语句块");
	}

	static MyInnerClass in = new MyInnerClass("静态变量s");

	MyInnerClass in01 = new MyInnerClass("a");

	{
		System.out.println("实例语句块");
	}

	MyInnerClass in02 = new MyInnerClass("b");

	public InitializationSequence() {
		System.out.println("构造函数");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InitializationSequence obj01 = new InitializationSequence();
		System.out.println("-----------------------------------");
		InitializationSequence obj02 = new InitializationSequence();
	}

}

class MyInnerClass {
	public MyInnerClass(String description) {
		System.out.println("成员变量初始化::" + description);
	}
}