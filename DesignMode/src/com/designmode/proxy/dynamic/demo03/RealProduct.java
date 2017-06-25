package com.designmode.proxy.dynamic.demo03;

public class RealProduct implements ProductInterface {

	@Override
	public void doit01() {
		System.out.println("RealProduct----doit");
	}

	@Override
	public void doit02(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("RealProduct----doit02----" + (a + b));
	}

}
