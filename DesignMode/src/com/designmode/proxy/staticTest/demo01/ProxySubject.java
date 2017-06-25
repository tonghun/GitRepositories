package com.designmode.proxy.staticTest.demo01;

public class ProxySubject implements Subject {

	RealSubject real;// �������и���ʵ��ɫ�����ã��Ա������ʵ��ɫ

	public ProxySubject(RealSubject real) {
		this.real = real;
	}

	@Override
	public void request() {
		System.out.println("RealSubjectִ��ǰ");
		this.real.request();// �ڴ����в�����ʵ��ɫ
		System.out.println("RealSubjectִ�к�");
	}

}
