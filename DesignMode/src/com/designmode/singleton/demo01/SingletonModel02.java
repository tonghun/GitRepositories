package com.designmode.singleton.demo01;

/**
 * ����ʽ�ڶ����״α�����֮ǰ�ʹ���������ϵͳ��ʼ������Ժ󣬶����������ʵ��������߷����ٶȡ�
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
