package com.javase.enumTest;

import org.junit.Test;

public class EnumTest {

	public void testType(MyConstants c) {
		switch (c) {
		case Constants_A:
			System.out.println("Constants_A::" + MyConstants.Constants_A);
			break;
		case Constants_B:
			System.out.println("Constants_A::" + MyConstants.Constants_A);
			break;
		default:
			break;
		}
	}

	public void testType(int seq) {
		switch (seq) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println("请重新输入");
		}
	}

	@Test
	public void test01() {
		this.testType(MyConstants.Constants_B);
		this.testType(3);
		MyConstants.Constants_A.print();
		System.out.println(MyConstants.Constants_A.name());
		System.out.println("Constants_A.sequence=" + MyConstants.Constants_A.getSequence());
		System.out.println(MyConstants.Constants_B.equals(MyConstants.Constants_E));
	}

}
