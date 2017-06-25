package com.designmode.decorator.demo01;

public  abstract class Decorator01 implements Component {
	private Component com;

	public Decorator01() {

	}

	public Decorator01(Component com) {
		this.com = com;
	}

	public void add() {
		com.add();
	}

}
