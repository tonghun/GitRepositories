package com.designmode.factory.simpleFactory.demo01;

/*
 * 1.演示工厂模式中的一种：简单工厂模式；
 * 2.工厂模式为对象的创建提供了一个过渡接口，隐藏了对象创建的具体过程，使代码更加灵活；
 * 3.简单工厂模式由三部分构成：工厂类、抽象产品、具体产品；
 * 工厂类：包含业务逻辑或者判读逻辑，通常由一个静态方法构成；
 * 抽象产品：通常为一个抽象类或者接口，以便创建具体的产品类；
 * 具体产品：继承或实现了抽象产品，为通过工厂类的静态方法创建的对象。
 */
public class Test01 {
	public static void main(String[] args) {
		try {
			Product product = Factory.getInstance("Product02");
			String content = product.method();
			System.out.println("创建的对象是：" + content);
		} catch (Exception e) {
			System.out.println("对象创建失败");
			e.printStackTrace();
		}

	}

}
