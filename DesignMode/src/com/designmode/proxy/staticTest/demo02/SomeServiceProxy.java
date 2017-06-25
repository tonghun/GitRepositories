package com.designmode.proxy.staticTest.demo02;

public class SomeServiceProxy implements ISomeService {

	private ISomeService service;

	public SomeServiceProxy() {
		super();
		service = new SomeServiceImpl();//在代理类构造方法内部创建目标对象
	}

	@Override
	public String doSome(String message) {
		return service.doSome(message).toUpperCase();
	}

}
