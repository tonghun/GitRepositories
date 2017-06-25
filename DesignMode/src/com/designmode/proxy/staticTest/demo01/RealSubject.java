package com.designmode.proxy.staticTest.demo01;

public class RealSubject implements Subject {
	public void request() {
		System.out.println(" from RealSubject");
	}
}
