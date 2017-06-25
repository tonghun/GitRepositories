package com.designmode.adapter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 适配器模式的目的使一个调度对象能够以一种相对简单的方式处理多个不同类型的处理对象，即一个对象兼容多个不同类型的对象。
 * 调度对象获取到处理对象以后，根据处理对象获取处理对象的适配器，处理对象的适配器是一个封装了处理对象的装饰者，
 * 然后处理适配器执行封装了处理对象方法的方法，间接执行处理对象的方法。
 * 
 * @author tonghuo
 *
 */
public class AdapterModeTest {

	private List<HAdapter> has;

	@Before
	public void before() {
		has = new ArrayList<HAdapter>();
		HAdapterImplA a = new HAdapterImplA();
		HAdapterImplB b = new HAdapterImplB();
		has.add(a);
		has.add(b);
	}

	@Test
	public void testAdapterMode() {
		Object handler = new IHandlerBImpl();
		HAdapter ha = getHAdapter(handler);
		ha.handler(handler);
	}

	private HAdapter getHAdapter(Object handler) {
		// TODO Auto-generated method stub
		for (HAdapter ha : has) {
			if (ha.supports(handler))
				return ha;
		}
		return null;
	}

}
