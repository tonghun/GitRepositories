package com.designmode.singleton.demo01;

import org.junit.Test;

public class SingletonTest {

	/**
	 * ����ʽ
	 */
	@Test
	public void testSingletonModel01() {
		SingletonModel01 instance01 = SingletonModel01.getInstance();
		SingletonModel01 instance02 = SingletonModel01.getInstance();
		System.out.println("--------------------����ʽ---------------------");
		System.out.println("instance01----" + instance01);
		System.out.println("instance02----" + instance02);
		System.out.println("instance01==instance02----" + (instance01 == instance02));
	}

	/**
	 * ����ʽ
	 */
	@Test
	public void testSingletonModel02() {
		SingletonModel01 instance01 = SingletonModel01.getInstance();
		SingletonModel01 instance02 = SingletonModel01.getInstance();
		System.out.println("--------------------����ʽ---------------------");
		System.out.println("instance01----" + instance01);
		System.out.println("instance02----" + instance02);
		System.out.println("instance01==instance02----" + (instance01 == instance02));
	}

}
