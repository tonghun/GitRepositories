package com.designmode.singleton.demo01;

/**
 * 饿汉式在对象首次被访问之前就创建，用于系统初始化完成以后，对象被立即访问的情况，提高访问速度。
 * 
 * @author tonghuo
 *
 */
public class SingletonModel02 {

	private SingletonModel02() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static SingletonModel02 instance = new SingletonModel02();

	public static SingletonModel02 getInstance() {
		if (instance == null) {
			instance = new SingletonModel02();
		}

		return instance;
	}

}
