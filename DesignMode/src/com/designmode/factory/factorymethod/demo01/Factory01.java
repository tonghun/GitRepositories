package com.designmode.factory.factorymethod.demo01;

public class Factory01 implements Factory {

	@Override
	public Product fMethod() {
		return new Product01();
	}

}
