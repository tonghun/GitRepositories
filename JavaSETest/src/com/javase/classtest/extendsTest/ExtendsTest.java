package com.javase.classtest.extendsTest;

import org.junit.Test;

/**
 * 子类的构造方法默认调用父类的无参构造方法，因此必须保证父类中存在无参构造方法，或者在子类中显式调用父类的有参构造方法。
 * 
 * @author tonghuo
 *
 */
@SuppressWarnings("unused")
public class ExtendsTest {

	@Test
	public void test01() {
		SubClass sub = new SubClass();
	}

}
