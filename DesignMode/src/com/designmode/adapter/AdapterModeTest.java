package com.designmode.adapter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * ������ģʽ��Ŀ��ʹһ�����ȶ����ܹ���һ����Լ򵥵ķ�ʽ��������ͬ���͵Ĵ�����󣬼�һ��������ݶ����ͬ���͵Ķ���
 * ���ȶ����ȡ����������Ժ󣬸��ݴ�������ȡ��������������������������������һ����װ�˴�������װ���ߣ�
 * Ȼ����������ִ�з�װ�˴�����󷽷��ķ��������ִ�д������ķ�����
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
