package com.designmode.proxy.dynamic.demo02;

public class RealSubject01 implements Subject {

	public void add(String s) {
		System.out.println(" the add of RealSubject01" + s);
	}

	public void delete(String s) {
		System.out.println("the delete of RealSubject01" + s);

	}
}
