package com.designmode.singleton.demo01;

/**
 * 
 * 懒汉式:在对象被访问时才创建对象，用于不确定对象访问时机的情况，节省内存空间。
 * 
 * @author tonghuo
 *
 */
public class SingletonModel01 {

	private SingletonModel01() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static SingletonModel01 instance;

	public static SingletonModel01 getInstance() {
		if (instance == null) {
			instance = new SingletonModel01();
		}

		return instance;
	}

}
