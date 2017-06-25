package com.designmode.proxy.dynamic.demo01;

public class RealSubject01 implements Subject {
	public void request() {
		System.out.println("from RealSubject01");
	}
}
