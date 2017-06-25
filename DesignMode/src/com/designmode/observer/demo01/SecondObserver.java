package com.designmode.observer.demo01;

public class SecondObserver implements IObserver {

	@Override
	public void handleNotify(String message) {
		// TODO Auto-generated method stub
		System.out.println("观察者SecondObserver接收到消息----[" + message + "]----正在处理");
	}

}
