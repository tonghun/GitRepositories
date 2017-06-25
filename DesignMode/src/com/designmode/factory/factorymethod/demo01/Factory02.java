package com.designmode.factory.factorymethod.demo01;

public class Factory02 implements Factory {

	@Override
	public Product fMethod() {
		return new Product02();
	}

}
