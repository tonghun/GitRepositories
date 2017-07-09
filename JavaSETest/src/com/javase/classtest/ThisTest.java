package com.javase.classtest;

import org.junit.Test;

/**
 * java中的this指向当前对象，即方法的直接调用对象
 * 
 * @author tonghuo
 *
 */
public class ThisTest {

	@Test
	public void test01() {
		Outer outer = new Outer();
		outer.printContent();
	}

}

class Outer {

	@SuppressWarnings("unused")
	private String name = "outer";

	Inner inner = new Inner();

	public void printContent() {
		inner.printContent();
		// System.out.println(this.name);
	}

}

class Inner {

	private String name = "inner";

	public void printContent() {
		System.out.println(this.name);
	}

}