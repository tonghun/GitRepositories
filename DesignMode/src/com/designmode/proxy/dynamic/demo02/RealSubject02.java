package com.designmode.proxy.dynamic.demo02;

public class RealSubject02 implements Subject {

	@Override
	public void add(String s) {
		// TODO Auto-generated method stub
		System.out.println("the add of RealSubject02" + s);
	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		System.out.println("the delete of RealSubject02" + s);

	}

}
