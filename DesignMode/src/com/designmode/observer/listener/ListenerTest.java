package com.designmode.observer.listener;

import org.junit.Test;

public class ListenerTest {

	@Test
	public void test01() {
		Performer performer = new Performer();// 事件源
		IListener listener = new CURDListener();// 监听器
		performer.setListener(listener);
		performer.create();
		performer.update();
		performer.delete();
		performer.retrieve();
	}
}
