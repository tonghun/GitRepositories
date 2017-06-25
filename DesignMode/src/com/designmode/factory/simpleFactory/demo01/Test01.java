package com.designmode.factory.simpleFactory.demo01;

/*
 * 1.��ʾ����ģʽ�е�һ�֣��򵥹���ģʽ��
 * 2.����ģʽΪ����Ĵ����ṩ��һ�����ɽӿڣ������˶��󴴽��ľ�����̣�ʹ���������
 * 3.�򵥹���ģʽ�������ֹ��ɣ������ࡢ�����Ʒ�������Ʒ��
 * �����ࣺ����ҵ���߼������ж��߼���ͨ����һ����̬�������ɣ�
 * �����Ʒ��ͨ��Ϊһ����������߽ӿڣ��Ա㴴������Ĳ�Ʒ�ࣻ
 * �����Ʒ���̳л�ʵ���˳����Ʒ��Ϊͨ��������ľ�̬���������Ķ���
 */
public class Test01 {
	public static void main(String[] args) {
		try {
			Product product = Factory.getInstance("Product02");
			String content = product.method();
			System.out.println("�����Ķ����ǣ�" + content);
		} catch (Exception e) {
			System.out.println("���󴴽�ʧ��");
			e.printStackTrace();
		}

	}

}
