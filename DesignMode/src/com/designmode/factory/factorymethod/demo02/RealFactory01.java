package com.designmode.factory.factorymethod.demo02;

public class RealFactory01 implements Factory {

	@Override
	public Product getInstance() {
		// TODO Auto-generated method stub
		return new RealProduct01();
	}

}
