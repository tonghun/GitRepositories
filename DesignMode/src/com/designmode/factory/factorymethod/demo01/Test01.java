package com.designmode.factory.factorymethod.demo01;

/*
 *1. ��������ģʽ������ڼ򵥹���ģʽ���������ֱ�Ӵ�������ֵ�����Ӧ�ľ��幤������
 * 2.��������֮ǰ������Ҫ������ö����Ӧ�Ĺ����ࣻ
 */
public class Test01 {
	public static void main(String[] args) {
		Factory f = new Factory02();
		Product p = f.fMethod();
		String content = p.pMethod();
		System.out.println("�����ǣ�" + content);
	}
}
