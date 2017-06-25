package com.designmode.adapter;

public class HAdapterImplB implements HAdapter {

	@Override
	public void handler(Object handler) {
		// TODO Auto-generated method stub
		((IHandlerB) handler).handle();
	}

	@Override
	public boolean supports(Object handler) {
		// TODO Auto-generated method stub
		return handler instanceof IHandlerB;
	}

}
