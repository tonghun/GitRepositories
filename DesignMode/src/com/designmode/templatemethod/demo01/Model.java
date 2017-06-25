package com.designmode.templatemethod.demo01;

/**
 * 
 * @author tonghuo
 * 
 *         模板方法设计模式：
 *
 *         1.什么是模板方法设计模式？如果某些对象具有相同的行为结构，那么将该行为结构提取出来，封装到一个抽象类中，、
 *         然后对象继承该抽象类，具体实现各步骤的行为，这样的模式称为模板方法设计模式，抽象类称为模板。
 *         2.模板的构成：final类型的行为结构，各步骤的抽象方法。
 */
public abstract class Model {
	/**
	 * 行为结构被定义为final类型，防止被修改
	 */
	public final void doAll() {
		doit01();
		doit02();
		doit03();
	}

	abstract void doit01();

	abstract void doit02();

	abstract void doit03();
}
