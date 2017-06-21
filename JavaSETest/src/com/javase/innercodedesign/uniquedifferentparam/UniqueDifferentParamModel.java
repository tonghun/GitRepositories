package com.javase.innercodedesign.uniquedifferentparam;

/**
 * Ψһ���������ƣ� 1.ʹ������������������true/false��ִ�з��������������һ��������ͬ����������ͬ��
 * �����Ƚ���������趨��false�����ϣ�Ȼ��ִ���жϣ������жϽ����������ֵ�����ִ�о���Ĵ����߼���
 * 2.����ʽ�ṹ��1.�趨��false�ϣ�2.�ж�true�Ƿ������3.����ִ�С�
 * 
 * @author tonghuo
 *
 */
public class UniqueDifferentParamModel {
	/*
	 * Ϊtrue����1��false,����
	 */
	public static int chooseDirection(int oldValue, boolean isAdd) {
		int a = 0;// �趨��false��
		if (isAdd)// �ж�true�Ƿ����
			a = 1;

		return oldValue + a;// ����ִ��
	}
}
