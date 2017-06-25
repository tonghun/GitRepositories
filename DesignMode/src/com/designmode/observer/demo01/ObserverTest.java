package com.designmode.observer.demo01;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void test01() {
		/**
		 * 创建观察者
		 */
		IObserver firstObserver = new FirstObserver();
		IObserver secondObserver = new SecondObserver();

		IObservable performer = new Performer();// 创建被观察者

		/**
		 * 添加观察者
		 */
		performer.addObserver(firstObserver);
		performer.addObserver(secondObserver);

		performer.notifyObservers("被观察者发生变化");

	}

}
