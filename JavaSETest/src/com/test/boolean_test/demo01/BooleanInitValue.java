package com.test.boolean_test.demo01;

import org.junit.Test;

/**
 * 未被初始化的boolean类型全局变量的默认值是false
 * 
 * @author tonghuo
 *
 */
public class BooleanInitValue {

	private boolean init;

	@Test
	public void testBooleanInit() {
		System.out.println("init----" + init);
	}

}
