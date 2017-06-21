package com.javase.string;

import org.junit.Test;

/**
 * String\StringBuffer\StringBuilder的区别：
 * 1.String类型对象长度固定，而StringBuffer与StringBuilder长度不固定。
 * 2.StringBuffer线程安全，StringBuilder线程不安全。
 * 3.执行速度：StringBuilder>StringBuffer>String
 * 
 * @author tonghuo
 *
 */
public class StringCreators {

	/**
	 * 相同的两个对象哈希值相同，两个对象哈希值不相等，这两个对象一定不相同。
	 */
	@Test
	public void testString() {
		String s = "s1";
		System.out.println("String的哈希值第一次=" + s.hashCode());
		s = s + "-s2";
		// 内容发生变化，hashCode发生变化，即String内容变化一次，创建一个对象
		System.out.println("String的哈希值第二次=" + s.hashCode());
		System.out.println("String字符串开始变化的时间点：" + System.currentTimeMillis());
		for (int i = 3; i < 100000; i++) {
			s = s + "-" + i;
		}
		System.out.println("String字符串结束变化的时间点：" + System.currentTimeMillis());
	}

	@Test
	public void testStringBuffer() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("s1");
		System.out.println("第一次输出StringBuffer=" + stringBuffer.hashCode());
		stringBuffer.append("-s2");
		// 内容发生变化，hashCode不变
		System.out.println("第二次输出StringBuffer=" + stringBuffer.hashCode());
		long beginTime = System.currentTimeMillis();
		System.out.println("StringBuffer开始变化的时间点：" + beginTime);
		for (int i = 3; i < 1000000; i++) {
			stringBuffer.append("-" + i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("StringBuffer结束变化的时间点：" + endTime);
		System.out.println("用时=" + (endTime - beginTime));
	}

	@Test
	public void testStringBuilder() {
		StringBuilder builder = new StringBuilder();
		builder.append("s1");
		System.out.println("第一次输出StringBuilder=" + builder.hashCode());
		builder.append("-s2");
		// 内容发生变化，hashCode不变
		System.out.println("第二次输出StringBuilder=" + builder.hashCode());
		long beginTime = System.currentTimeMillis();
		System.out.println("StringBuilder开始变化的时间点：" + beginTime);
		for (int i = 3; i < 1000000; i++) {
			builder.append("-" + i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("StringBuilder结束变化的时间点：" + endTime);
		System.out.println("用时=" + (endTime - beginTime));
	}
}
