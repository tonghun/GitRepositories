package com.designmode.proxy.staticTest.demo01;

public class Test01 {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		Subject proxySubject = new ProxySubject(realSubject);
		proxySubject.request();
	}
}
