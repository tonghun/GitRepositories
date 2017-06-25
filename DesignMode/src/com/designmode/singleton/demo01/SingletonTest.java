package com.designmode.singleton.demo01;

import org.junit.Test;

public class SingletonTest {

	/**
	 * ÀÁººÊ½
	 */
	@Test
	public void testSingletonModel01() {
		SingletonModel01 instance01 = SingletonModel01.getInstance();
		SingletonModel01 instance02 = SingletonModel01.getInstance();
		System.out.println("--------------------ÀÁººÊ½---------------------");
		System.out.println("instance01----" + instance01);
		System.out.println("instance02----" + instance02);
		System.out.println("instance01==instance02----" + (instance01 == instance02));
	}

	/**
	 * ¶öººÊ½
	 */
	@Test
	public void testSingletonModel02() {
		SingletonModel01 instance01 = SingletonModel01.getInstance();
		SingletonModel01 instance02 = SingletonModel01.getInstance();
		System.out.println("--------------------¶öººÊ½---------------------");
		System.out.println("instance01----" + instance01);
		System.out.println("instance02----" + instance02);
		System.out.println("instance01==instance02----" + (instance01 == instance02));
	}

}
