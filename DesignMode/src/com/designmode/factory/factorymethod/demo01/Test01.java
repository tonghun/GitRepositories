package com.designmode.factory.factorymethod.demo01;

/*
 *1. 工厂方法模式：相比于简单工厂模式，将对象的直接创建任务分担给相应的具体工厂对象；
 * 2.创建对象之前，首先要创建与该对象对应的工厂类；
 */
public class Test01 {
	public static void main(String[] args) {
		Factory f = new Factory02();
		Product p = f.fMethod();
		String content = p.pMethod();
		System.out.println("对象是：" + content);
	}
}
