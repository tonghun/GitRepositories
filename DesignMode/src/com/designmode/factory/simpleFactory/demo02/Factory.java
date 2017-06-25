package com.designmode.factory.simpleFactory.demo02;

public class Factory {

	public static Product getProduct(int i) {

		switch (i) {
		case 0:
			return new RealProduct01();
		case 1:
			return new RealProduct02();
		default:
			System.out.println("产品编号不存在");
		}

		return null;

	}

}
