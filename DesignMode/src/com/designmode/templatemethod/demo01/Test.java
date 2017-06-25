package com.designmode.templatemethod.demo01;

public class Test {
	public static void main(String[] args) {
		System.out.println("main01");
		Model objA = new ObjA("A");
		Model objB = new ObjB("B");
		objA.doAll();
		System.out.println("------------");
		objB.doAll();
	}
}
