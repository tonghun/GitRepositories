package com.designmode.adapter;

public class HAdapterImplA implements HAdapter {

	@Override
	public void handler(Object handler) {
		// TODO Auto-generated method stub
		((IHandlerA) handler).handle();
	}

	@Override
	public boolean supports(Object handler) {
		// TODO Auto-generated method stub
		return handler instanceof IHandlerA;
	}

}
