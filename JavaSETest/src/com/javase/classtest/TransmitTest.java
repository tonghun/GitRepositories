package com.javase.classtest;

import org.junit.Test;

public class TransmitTest {

	public void change(String str) {
		str = "baidu";
	}

	@Test
	public void testString() {
		String str01 = new String("www.baidu.com");
		change(str01);
		System.out.println(str01);
	}

	public void change(int b) {
		b = 7;
	}

	@Test
	public void testBasic() {
		int a = 9;
		change(a);
		System.out.println(a);
	}

	public void change(StringBuilder builder01) {
		builder01.append(" World!");
	}

	@Test
	public void testStringBuilder() {
		StringBuilder builder = new StringBuilder("Hello");
		change(builder);
		System.out.println(builder);
	}

	public void change(MyInner in) {
		in=new MyInner();
		in.a = 1;
	}

	@Test
	public void testDemain() {
		MyInner in = new MyInner();
		in.a = 9;
		change(in);
		System.out.println(in.a);
	}
}

class MyInner {
	public int a;
}