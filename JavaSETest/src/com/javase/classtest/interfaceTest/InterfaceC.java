package com.javase.classtest.interfaceTest;

public interface InterfaceC extends SupInterfaceA, SupInterfaceB {

	@Override
	default void doit01() {
		// TODO Auto-generated method stub
		System.out.println("do01");
	}

}
