package com.designmode.observer.listener;

public class CURDListener implements IListener {

	@Override
	public void handleCreEvent(IEvent event) {
		// TODO Auto-generated method stub
		System.out.println("监听器处理create");
	}

	@Override
	public void handleDelEvent(IEvent event) {
		// TODO Auto-generated method stub
		System.out.println("监听器处理delete");
	}

	@Override
	public void handleUpdEvent(IEvent event) {
		// TODO Auto-generated method stub
		System.out.println("监听器处理update");
	}

	@Override
	public void handleRetEvent(IEvent event) {
		// TODO Auto-generated method stub
		System.out.println("监听器处理retrieve");
	}

}
