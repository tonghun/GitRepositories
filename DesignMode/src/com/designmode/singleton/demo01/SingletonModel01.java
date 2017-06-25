package com.designmode.singleton.demo01;

/**
 * 
 * ����ʽ:�ڶ��󱻷���ʱ�Ŵ����������ڲ�ȷ���������ʱ�����������ʡ�ڴ�ռ䡣
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
