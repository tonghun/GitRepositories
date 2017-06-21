package com.test.abstractClass;

/**
 * 1.抽象类中既可以有抽象方法（没有方法体），也可以有具体方法。 2.抽象类中的抽象方法不可以省略abstract。
 * 
 * 3.接口只有能抽象方法，任何一个方法都是public abstract类型的，public
 * abstract可以省略。
 * 
 * @author tonghuo
 *
 */
public abstract class AbstractClass {
	abstract void abstractMethod();

	public void concreteMethod() {

	}
}
