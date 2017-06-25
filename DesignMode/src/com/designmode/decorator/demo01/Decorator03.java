package com.designmode.decorator.demo01;

public class Decorator03 extends Decorator01 {

	public Decorator03(Component com) {
		super(com);// 如果一个类继承父类，那么最好在构造方法当中调用父类的构造方法，这样可以实例化父类对象，避免后面引用父类特征时出现空指针异常
	}

	public void update() {
		System.out.println("the update of Decorator03");
	}

	public void add() {
		super.add();
		update();
	}

}
