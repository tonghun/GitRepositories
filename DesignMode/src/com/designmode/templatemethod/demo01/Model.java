package com.designmode.templatemethod.demo01;

/**
 * 
 * @author tonghuo
 * 
 *         ģ�巽�����ģʽ��
 *
 *         1.ʲô��ģ�巽�����ģʽ�����ĳЩ���������ͬ����Ϊ�ṹ����ô������Ϊ�ṹ��ȡ��������װ��һ���������У���
 *         Ȼ�����̳иó����࣬����ʵ�ָ��������Ϊ��������ģʽ��Ϊģ�巽�����ģʽ���������Ϊģ�塣
 *         2.ģ��Ĺ��ɣ�final���͵���Ϊ�ṹ��������ĳ��󷽷���
 */
public abstract class Model {
	/**
	 * ��Ϊ�ṹ������Ϊfinal���ͣ���ֹ���޸�
	 */
	public final void doAll() {
		doit01();
		doit02();
		doit03();
	}

	abstract void doit01();

	abstract void doit02();

	abstract void doit03();
}
