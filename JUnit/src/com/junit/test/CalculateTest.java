package com.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.junit.tested.Calculate;

public class CalculateTest {

	private Calculate c = new Calculate();

	@BeforeClass
	public static void beforeClass() {
		System.out.println("���в��Կ�ʼ֮ǰִ��");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("���в��Կ�ʼ֮��ִ��");
	}

	@Before
	public void beforeTest() {
		System.out.println("����ǰִ��");
	}

	@After
	public void afterTest() {
		System.out.println("���Ժ�ִ��");
	}

	@Test
	public void testPlus() {
		int plus_result = c.plus(2, 3);
		assertEquals(5, plus_result);
	}

	@Test
	public void testMinus() {
		int minus_result = c.minus(9, 3);
		assertEquals(6, minus_result);
	}

	@Test
	public void testMultiply() {
		int multiply_result = c.multiply(2, 3);
		assertEquals(5, multiply_result);
	}

	@Ignore
	@Test
	public void testDivide() {
		int divide_result = c.divide(12, 3);
		assertEquals(4, divide_result);
	}

}
