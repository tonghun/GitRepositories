package com.javase.classtest;

/**
 * 抽象类是对多个具体类某方面特性的抽象，不是全部特性的抽象，因此抽闲类中不仅有抽象方法，还保留了具体方法。
 * 为了区分抽象方法与具体方法，抽象方法前必须加abstract
 * 
 * @author tonghuo
 *
 */
public abstract class AbstractClass {

	public AbstractClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	abstract void abstractMethod();

	public void concreteMethod() {

	}
}
