package com.designmode.factory.factorymethod.demo02;

public class RealFactory02 implements Factory {

	@Override
	public Product getInstance() {
		// TODO Auto-generated method stub
		return new RealProduct02();
	}

}
