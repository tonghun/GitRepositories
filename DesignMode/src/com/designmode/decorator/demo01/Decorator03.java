package com.designmode.decorator.demo01;

public class Decorator03 extends Decorator01 {

	public Decorator03(Component com) {
		super(com);// ���һ����̳и��࣬��ô����ڹ��췽�����е��ø���Ĺ��췽������������ʵ����������󣬱���������ø�������ʱ���ֿ�ָ���쳣
	}

	public void update() {
		System.out.println("the update of Decorator03");
	}

	public void add() {
		super.add();
		update();
	}

}
