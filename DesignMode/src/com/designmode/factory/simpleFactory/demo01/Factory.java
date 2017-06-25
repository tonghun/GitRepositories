package com.designmode.factory.simpleFactory.demo01;

public class Factory {
	public static Product getInstance(String p) throws Exception {
		if (p.equals("Product01"))
			return new Product01();
		else if (p.equals("Product02"))
			return new Product02();
		else
			return null;
	}

}
